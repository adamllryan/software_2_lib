#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int *addPoints(int *point1, int *point2){
     static int ret[2]; //int should be static class scope linkage
     ret[0] = point1[0] + point2[0];
     ret[1] = point1[1] + point2[1];
     return ret;
}
int main(int argc, char**argv){
    int x[2] = {0, 2};
    int y[2] = {3, 2};
    int *z = addPoints(x, y);
    return 0;
}