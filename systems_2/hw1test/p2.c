#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int *add(int *a, int *b){
    int *ret = (int*)malloc(sizeof(int)); //cast to int
    if(a==NULL || b==NULL)
        return NULL;
    *ret = *a + *b;
    return ret;
}
int main(int argc, char**argv){
    int a = 3;
    int b = 4;
    int * ret = add(&a, &b);
    if(ret==NULL)
        printf("Error\n");
    else
        printf("3+4=%d\n", *ret);
    free(ret); //free ret value
    return 0;
}