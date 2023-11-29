#include <netinet/in.h>
#include <stdio.h>
#include <stdlib.h>
#include <strings.h>
#include <sys/socket.h>
#include <unistd.h>
#include <sys/stat.h>

#define BUFF_SIZE 1000
#define FILE_NAME_SIZE 256

int receiveFile(int sd, FILE *fp, int totalBytes);
int receiveFileName(int sd, char* buffer, int size);
int errorHandler(int rc, char *section);

int main(int argc, char *argv[]) {
  int sd, connected_sd, rc, port, sock, b;
  struct sockaddr_in addr;
  struct sockaddr_in from_address;
  char buffer[BUFF_SIZE];
  int flags = 0;
  socklen_t fromLength;
  int file_size = 0, file_name_size = 0;
  char *dir_path = "./output/";
  char file_name[FILE_NAME_SIZE];
  FILE *fp;

  if (argc != 2) {
    printf("Usage: ftps.c <port>\n");
    exit(1);
  }
  if (mkdir(dir_path, 0777) == -1) {
    perror("tried to make dir");
  }
  port = atoi(argv[1]);
  // setup socket
  sock = socket(AF_INET, SOCK_STREAM, 0);
  addr.sin_family = AF_INET;
  addr.sin_port = htons(port);
  addr.sin_addr.s_addr = INADDR_ANY;
  b = bind(sock, (struct sockaddr *)&addr, sizeof(addr));
  listen(sock, 5);
  printf("Server started\n");
  printf("Listening on port %i\n", port);
  while (1) {

    connected_sd = accept(sock, (struct sockaddr *)&from_address, &fromLength);
    printf("Client connect\n");

    if (connected_sd < 1) {
      break;
    }
    while (1) {
      // read file name size
      rc = read(connected_sd, &file_name_size, sizeof(int));
      file_name_size = ntohl(file_name_size);
      errorHandler(rc, "file name size read");
      if (!rc) {
        goto END;
      }        
      printf("File name size received: %i bytes. \n", file_name_size);
      // read file name
      memset(buffer, 0, BUFF_SIZE);
      rc = receiveFileName(connected_sd, buffer, file_name_size);
      errorHandler(rc, "file name read");
      if (!rc) {
        goto END;
      }        
      printf("File name received: %s\n", buffer);
      // read file size
      //adding directory path to file name so we don't overwrite our test files :)
      memset(file_name, 0, FILE_NAME_SIZE);
      strcat(file_name, dir_path);
      strcat(file_name, buffer);
      fp = fopen(file_name, "w");
      // add error handler for fp
      rc = read(connected_sd, &file_size, sizeof(int));
      if (!rc) {
        goto END;
      }
      errorHandler(rc, "file size read");
      printf("File size: ntohl(%i)=", file_size);
      file_size = ntohl(file_size);
      printf("%i bytes. \n\n", file_size);
      

      memset(buffer, 0, BUFF_SIZE);
      receiveFile(connected_sd, fp, file_size);
      fclose(fp);
    }
  END:
    printf("Client disconnected\n");
    close(connected_sd);
  }
}

int receiveFile(int sd, FILE *fp, int totalBytes) {
  int rc, bytesReceived = 0, bytesWritten = 0;
  char buffer[BUFF_SIZE];
  memset(buffer, 0, BUFF_SIZE);
  while (totalBytes > bytesReceived && (rc = read(sd, buffer, BUFF_SIZE)) > 0) {

    bytesReceived += rc;
    printf("\033[1A");
    printf("Bytes received: %i %i/%i bytes. \n", rc, bytesReceived, totalBytes);

    bytesWritten += fwrite(buffer, 1, rc, fp);
    memset(buffer, 0, BUFF_SIZE);
  }
END:
  bytesReceived = htonl(bytesReceived);
  rc = write(sd, &bytesReceived, sizeof(bytesReceived));
  printf("File transfer ended. Sent %i bytes ack. \n", rc);
  return 0;
}

int receiveFileName(int sd, char* buffer, int size) {
  int totalBytes = 0, rc;
  char* ptr = buffer;
  while (totalBytes < size) {
    rc = read(sd, ptr, size - totalBytes);
    if (rc < 0) {
      perror("read");
      close(sd);
      exit(-1);
    }

    totalBytes += rc;
    ptr += rc;
    printf("Bytes received: %s %i/%i bytes. \n", buffer, totalBytes, size);
  }
  return totalBytes;
}

int errorHandler(int rc, char *section) {
  if (rc < 0) {
    perror(section);
    exit(1);
  } else if (rc == 0) {
    perror("Client sent 0 bytes (closed connection)");
  }
  return 0;
}
