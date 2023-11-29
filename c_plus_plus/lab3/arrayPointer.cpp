#include <iostream>
#include <stdlib.h>
using namespace std;
int main()
{
	int NUMBER_ELEMENTS;
	cout << "Input array size: ";
	cin >> NUMBER_ELEMENTS;
	short* arr1 = (short*)malloc(sizeof(short) * NUMBER_ELEMENTS);
	if (arr1 == NULL)
		cerr << "Array1 null pointer failure";
	else for (int i = 0; i < NUMBER_ELEMENTS; i++)
	{
		*(arr1 + i) = i;
		cout << arr1[i];
	}
	cout << endl;
	int NUMBER_ELEMENTS_2 = NUMBER_ELEMENTS/2;
	short* arr2 = (short*)malloc(sizeof(short) * NUMBER_ELEMENTS_2);
	if (arr2 == NULL)
		cerr << "Array2 null pointer failure";
	else for (int i = 0; i < NUMBER_ELEMENTS_2; i++)
	{
		*(arr2 + i) = *(arr1 + (2 * i) + 1);
		cout << arr2[i];
	}
	cout << endl;
	free(arr1);
	free(arr2);
	return 0;
}
