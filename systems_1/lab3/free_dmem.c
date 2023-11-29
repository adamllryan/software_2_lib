/* BY SUBMITTING THIS FILE TO CARMEN, I CERTIFY THAT I HAVE STRICTLY ADHERED TO THE
TENURES OF THE OHIO STATE UNIVERSITY’S ACADEMIC INTEGRITY POLICY WITH RESPECT TO
THIS ASSIGNMENT.
 */
#include "lab3.h"
#include <stdlib.h>
#include <stdio.h>
void free_dmem(char** ingredients, int size, char*** pizza) {
	int i;
	/*free every item in array*/
	for (i = 0; i<size; i++) {
		/*printf("freeing %s\n", ingredients[i]);*/	
		free(*(ingredients+i));
	}
	/*free pointers of array*/
	free(ingredients);
	free(pizza);
}