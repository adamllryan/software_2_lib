#include <arpa/inet.h>
#include <fcntl.h>
#include <netinet/in.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <sys/socket.h>
#include <unistd.h>

#define BUFF_SIZE 1000
#define WIN_SIZE 10
#define HEADER_SIZE 15
#define DATA_SIZE 2
#define max(a, b) ((a) > (b) ? (a) : (b))
#define min(a, b) ((a) < (b) ? (a) : (b))
int main(int argc, char *argv[]) {
  /* VARIABLE DECLARATION */

  char *ip, *string;
  int port, sd, left, right, total, size, i, ack, temp;
  struct sockaddr_in addr;
  struct timeval tv[5];
  char packets[WIN_SIZE / DATA_SIZE][HEADER_SIZE + DATA_SIZE];
  char acks[WIN_SIZE / DATA_SIZE][11];

  /* LOCAL SECTION */

  /* CHECK ARGUMENTS */

  if (argc != 3) {
    printf("Usage is: client <ip> <port>\n");
    exit(1);
  }

  /* ARGUMENTS */

  ip = argv[1];
  port = strtol(argv[2], NULL, 10);

  /* USER INPUT */

  printf("Enter string to send: ");
  string = malloc(sizeof(char) * BUFF_SIZE);
  scanf("%[^\n]", string);

  /* NETWORK SECTION */

  /* CREATE SOCKET */

  sd = socket(AF_INET, SOCK_DGRAM, 0);
  // set sd nonblocking
  fcntl(sd, F_SETFL, O_NONBLOCK);

  /* IP ADDRESS */

  addr.sin_family = AF_INET;
  addr.sin_port = htons(port);
  addr.sin_addr.s_addr = inet_addr(ip);

  left = 0;
  total = strlen(string);

  printf("Size of string: %d\n", total);

  /* CONNECT TO SERVER */

  if (connect(sd, (struct sockaddr *)&addr, sizeof(addr)) < 0) {
    close(sd);
    perror("Error connecting to server");
    exit(1);
  }

  /* SEND SIZE OF MESSAGE */

  size = htonl(total);

  sendto(sd, &size, sizeof(size), 0, (struct sockaddr *)&addr, sizeof(addr));

  printf("Sent size of message: %d\n", total);

  ack = -10;
  /* MAIN LOOP*/

RESEND:
  while (left < total) {

    printf("\n============WINDOW START=============\n");

    /* FOR EVERY PACKET IN WINDOW LOOP */

    for (i = left; i < min(left + WIN_SIZE, total); i += DATA_SIZE) {

      /* CREATE PACKET */

      sprintf(packets[i % (WIN_SIZE / DATA_SIZE)], "%11d%4d", i,
              min(DATA_SIZE, total - i));

      /* APPEND DATA TO PACKET */

      strncat(packets[i % (WIN_SIZE / DATA_SIZE)], string + i, DATA_SIZE);

      printf("Packet %d: \"%s\", length=%i\n", i,
             packets[i % (WIN_SIZE / DATA_SIZE)],
             strlen(packets[i % (WIN_SIZE / DATA_SIZE)]));

      /* SEND PACKET */

      sendto(sd, packets[i % (WIN_SIZE / DATA_SIZE)],
             strlen(packets[i % (WIN_SIZE / DATA_SIZE)]), 0,
             (struct sockaddr *)&addr, sizeof(addr));

      printf("Sent packet %d\n", i);

      /* RECEIVE 11 BYTE ACK */

      recvfrom(sd, acks[0], 11, 0, NULL, NULL);
      sscanf(acks[0], "%11d", &ack);
    }

    printf("=============WINDOW END==============\n\n");

    /* SET TIMEOUT HERE */
    /* NOTE: I wanted to do a timeout for each ack but I am both lazy
     * and out of time.
     * */

    tv[0].tv_sec = 0;
    tv[0].tv_usec = 100000;
    // start timeout

    /* WAIT FOR TIMEOUT OR ACK TO LAND */

    while (ack + 2 < min(left + WIN_SIZE, total)) {

      /*RECEIVE AND PARSE*/

      recvfrom(sd, acks[0], 11, 0, NULL, NULL);
      sscanf(acks[0], "%11d", &ack);

      printf("Received ack: %d (This means %d+2=(%d/%d) bytes received)\n", ack,
             ack, min(total, ack + 2), total);

      /* INCREMENT WINDOW ON LOWEST ACK */

      left = max(left, ack + 2);

      /* EXIT LOOP ON TIMEOUT */

      if (select(sd + 1, NULL, NULL, NULL, &tv[0]) == 0 && ack + 2 == left) {
        goto RESEND;
      }
      /* ACK HAS NOT CHANGED AT THIS POINT DO NOTHING */
    }
  }

  /* CLOSE SOCKET */

  close(sd);

  printf("All packets sent. Closing. \n");

  return 0;
}
// define buffer as 17 bytes
// create vars for ipaddr, portnum, sockfd, windex, rindex, seqnum, acknum,
// ack, size, data, checksum create UDP socket create sliding window Data
// portion of segment set will be 2 bytes max, MSS is 17 bytes, 15 bytes of
// header, 2 bytes of data Collect user input and make sure there are two
// arguments only arg1 is ip address, arg2 is port number loop while all
// packets have not been acked loop through every packet in window set timeout
// while timeout is not reached or ack greater than last is received
/*
In this project the student will write a client that sends a string entered by
the user to my server. The client is implementing an RDT and a sliding window
protocol. The data portion of the segment set will be 2 bytes maximum. The MSS
is 17 bytes, that means 15 bytes of ‘header’ and 2 bytes of ‘data’ (max). We
will be using UDP to send the segment. We will be exploring sending windows,
sequence numbers, and ACKs in this program. The maximum number of data bytes
that can be in your ‘send window’ is 10 bytes. We will follow the same rules
as discussed in class, you cannot move your window until you receive an ACK
for the lowest packet/seq number in your send window. If you send more than
the window size, the server complains, and you lose points. To make it
interesting, if your client sends seq#0, and my server receives that
correctly, my server will send a 0 to ack that it received the packet with seq
number 0. NOTE this is different from normal TCP, but I wanted to vary it a
bit. Occasionally, my server will drop a packet. Let’s say that you send
packets with seq # 0, 2, 4. If I drop packet number 2, then when I receive
packet with seq Number 4, I will drop it too. So, your client MUST timeout and
resend packet 2, then 4, etc. I do not do any buffering on the server. The
format (syntax) for the messages is as follows: • From Client to server o
Message 1 from client to server: 4 bytes size of the message that is going to
be sent (use htonl to encode) – WE WILL ASSUME IT GETS TO THE SERVER
o Message 2+ from client to server: a 17 byte string/buffer with:
▪ the seq number in an
11 char field, don’t have to use htonl since it is a string (see below on how
I write them into the send buffer) ▪ a 4 byte field with the size (no htonl)
(see below on how I write them into the send buffer) ▪ followed by up to 2
bytes of the string (always send 2 bytes, except the last time if the string
length is odd, you will send 1 byte) • Message from Client to server: o To
make life easier, I do no ACK the size message. We will assume it arrives
correctly! o All other messages: ▪ If the correct seq number is received, the
server will ACK that seq number (so if the client sends seq# 2, size 2, the
server will ack 2) ▪ This is sent in an 11 byte field (no htonl) as above ▪ •
Here is how I put the seq# and size into the string o sprintf (bufferOut,
"%11d%4d", (seqNumber), (sizeOfSendBuffer)); • Here is how I pull them out on
the other side o sscanf(buffer, "%11d%4d", &seqNumber, &bytesSent); The
project MUST be written in “C” and must run on the university linux systems.
The client and the server will make use of UDP DGRAM sockets.
The server must be called server(provided for you) and the client will be
called client. The project must contain a makefile that allows for “make
clean” as well as making the client executable. The server will take 1
parameter, the portnumber it is listening on. The client will take 2
parameters, the ip address of the server, and the portnumber of the server The
client should prompt the user for string to send. The server will exit once
the string is received (one and done server) To test: I will send the
following strings: Hello world, how are you today? I am fine, thanks for
asking me Hello world, how are you today? I am fine, thanks for asking me!
*/
