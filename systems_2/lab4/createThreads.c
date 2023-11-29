#include <stdio.h>
#include <pthread.h>
#define THREAD_NO 10

void *mythread(void *arg) {
    printf("my id is %d\n", (int)arg);
    pthread_exit(0);
}

int main(){
    pthread_t p[THREAD_NO];
    pthread_attr_t attr;
    int i = 0;
    pthread_attr_init(&attr);
    pthread_attr_setscope(&attr, PTHREAD_SCOPE_SYSTEM);
	pthread_attr_setschedpolicy(&attr, SCHED_OTHER);
    for(i=0; i<THREAD_NO; i++){
        pthread_create(&p[i], &attr, mythread, (void*)i);
    }

    for(i=0; i<THREAD_NO; i++){
	    pthread_join(p[i], NULL);
    }
    return 0;
}