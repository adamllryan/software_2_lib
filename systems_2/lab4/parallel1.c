//parallel.c

#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>
#define ARRAY_SIZE 1000000
#define THREAD_NO 10

int sum = 0;

void *mythread(void *arg) {
    int *arr = (int*)arg;
    int i;
    for (i = 0; i < ARRAY_SIZE/THREAD_NO; i++) {
        sum += arr[i];
    }
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
    return 0;
}