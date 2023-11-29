/* BY SUBMITTING THIS FILE TO CARMEN, I CERTIFY THAT I HAVE STRICTLY ADHERED TO THE
TENURES OF THE OHIO STATE UNIVERSITY’S ACADEMIC INTEGRITY POLICY WITH RESPECT TO
THIS ASSIGNMENT.
 */
#include "lab3.h"
#include <stdio.h>

void get_num_ingredients(int* location) {
	/*prompt user for number of ingredients and write to location*/
	printf("How many available pizza ingredients do we have today? ");
	scanf(" %i", location);
}
