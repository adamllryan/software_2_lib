#include<unistd.h>
#include <stdio.h>
int main() {
    int i = 0;
    while (1) {
        printf("Child still running\n");
        i++;
        if (i>=15) {
            break;
        }
        sleep(1);
    }
    return 0;
}