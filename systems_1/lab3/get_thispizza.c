/* BY SUBMITTING THIS FILE TO CARMEN, I CERTIFY THAT I HAVE STRICTLY ADHERED TO THE
TENURES OF THE OHIO STATE UNIVERSITY’S ACADEMIC INTEGRITY POLICY WITH RESPECT TO
THIS ASSIGNMENT.
 */
#include "lab3.h"
#include <stdio.h>
#include <stdlib.h>
char*** get_thispizza(int* num_toppings, char*** pizza, char** ingredients) {
	int temp, i;
	/*collect # of user choice toppings, toppings, then return pizza*/
	scanf(" %i", num_toppings);
	pizza = malloc(sizeof(char*) * *num_toppings);
	
	printf("Enter the number next to each ingredient you want on your pizza: ");
	for (i = 0; i<*num_toppings; i++) {
		scanf("%i", &temp);
		*(pizza+i) = &*(ingredients+temp-1);
	}
	printf("The ingredients on your pizza will be\n");
	for (i = 0; i<*num_toppings; i++) {
		printf("%i. %s\n", i+1, **(pizza+i));
	}
	return pizza;
}