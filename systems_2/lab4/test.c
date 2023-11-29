#include <stdio.h>
#include <pthread.h>
#include <stdlib.h>
#define NUM_THREADS 5

/* Fork this repl! You may work with up to 3 other people.
1. Create an array of random integers
2. Partition the array so that each thread 
  counts only some of the integers in the array.
3. Each thread should only count integers over 50. */
//Note: When running on stdlinux, this will result in a warning that students will fix in Lab 4. The warning occurs because the value of i is not intended to be sent as a void * param.

void *runner(void *param);

int main(int argc, char *argv[])
{
	 int i;
	pthread_t tid[NUM_THREADS];
	pthread_attr_t attr;

	/* get the default attributes */
	pthread_attr_init(&attr);

	/* set the scheduling algorithm to PROCESS or SYSTEM */
	pthread_attr_setscope(&attr, PTHREAD_SCOPE_SYSTEM);

	/* set the scheduling policy - FIFO, RT, or OTHER */
	pthread_attr_setschedpolicy(&attr, SCHED_OTHER);

	/* create the threads */
	for (i = 0; i < NUM_THREADS; i++)
		pthread_create(&tid[i],&attr,runner, (void*)i);
  	/* now join on each thread */
	for (i = 0; i < NUM_THREADS; i++)
		pthread_join(tid[i], NULL);
  printf("All threads are done\n");
}
 /* Each thread will begin control in this function */
void *runner(void *param)
{ 
  
	printf("%d I am a thread\n", (int)param);

	pthread_exit(0);
}