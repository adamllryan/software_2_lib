#include <iostream>
#include <stdlib.h>
using namespace std;
//could cause issues because a local variable will not exist after scope has ended, but for some reason it worked for me I must have made a mistake. 
int& getRefVar()
{
	int i = 1;
	return i;		
}

int main()
{
	//attempts to access int pointer 1 sizeof(int*) above var address
	//int* var;
	//cout << *(var+1);
	cout << getRefVar();
	return 0;
}
