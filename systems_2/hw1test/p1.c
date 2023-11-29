#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int main(int argc, char**argv){
    char *str = (char*)malloc(sizeof(char)*3); //cast to (char*)?
    memcpy(str, "abc", 4); //should have spot for \0?
    printf("%s\n", str); //couldn't really think of any real bugs + never used memcpy before
    free(str);
    return 0;
}