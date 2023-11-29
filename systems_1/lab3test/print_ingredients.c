/* BY SUBMITTING THIS FILE TO CARMEN, I CERTIFY THAT I HAVE STRICTLY ADHERED TO THE
TENURES OF THE OHIO STATE UNIVERSITY’S ACADEMIC INTEGRITY POLICY WITH RESPECT TO
THIS ASSIGNMENT.
 */
#include "lab3.h"
#include <stdio.h>

void print_ingredients(char** list, int len) {
	int i;
	printf("\nAvailable ingredients today are: \n");
	/*prints out all elements in passed string array*/
	for (i = 0; i<len; i++) {
		printf("%i. %s\n", i+1, *(list + i));
	}
	printf("\nWelcome to our Pizza ordering system! \nToday we have the following fresh ingredients available: \n\n");
	for (i = 0; i<len; i++) {
		printf("%i. %s\n", i+1, *(list + i));
	}
	printf("\nOf our %i available ingredients, how many do you plan to put on your pizza? ", len);
}

