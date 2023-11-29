/* BY SUBMITTING THIS FILE TO CARMEN, I CERTIFY THAT I HAVE STRICTLY ADHERED TO THE
   TENURES OF THE OHIO STATE UNIVERSITY’S ACADEMIC INTEGRITY POLICY WITH RESPECT TO
   THIS ASSIGNMENT.
   Name: Adam Ryan      
*/
#include <stdio.h>
#include "local_file.h"

int getchar_return_value;
void print_chars(unsigned int maxEntries) {
	int i;
	printf("enter the %u characters: ", maxEntries);
	
	for (i=0;i<maxEntries;i++) {
		getchar_return_value = getchar();
		if (i==0) printf("The keyboard values are: \n");
		if (getchar_return_value!=EOF) {
			putchar(getchar_return_value);
			putchar('\n');
		} else {
			printf("fewer than %u characters entered, number of characters set to %d\n", maxEntries, i);
			maxEntries = i;
			break;
 		}
	}
	return;
}





