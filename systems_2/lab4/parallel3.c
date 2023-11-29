//parallel2.c

#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>
#define ARRAY_SIZE 1000000
#define THREAD_NO 10

int sum = 0;

int lockCount = 0;
int unlockCount = 0;

int locked = 0;
void lock() {
    while (locked);
    locked = 1;
    lockCount++;
}
void unlock() {
    locked = 0;
    unlockCount++;
}
void *mythread(void *arg) {
    int *arr = (int*)arg;
    int internal_sum = 0;
    int i;
    for (i = 0; i < ARRAY_SIZE/THREAD_NO; i++) {
        internal_sum += arr[i];
    }
    lock();
    sum += internal_sum;
    unlock();
    pthread_exit(0);
}

int main(){
    pthread_t p[THREAD_NO];
    int num[THREAD_NO][ARRAY_SIZE/THREAD_NO];
    int i, j;
    srand(100);
    //initialize arrays
    for(i=0; i< THREAD_NO; i++){
    	for(j=0; j< ARRAY_SIZE/THREAD_NO; j++){
                num[i][j] = rand() % 100;
    	}
    }
    
    for (i = 0; i < THREAD_NO; i++) {
        pthread_create(&p[i], NULL, mythread, num[i]);
    }
    for(i=0; i<THREAD_NO; i++){
	    pthread_join(p[i], NULL);
    }
    printf("sum = %d\n", sum);
    printf("Total Unlocks: %d\n", unlockCount);
    printf("Total Locks: %d\n", lockCount);
    return 0;
}