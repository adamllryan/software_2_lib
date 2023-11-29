/* BY SUBMITTING THIS FILE TO CARMEN, I CERTIFY THAT I HAVE STRICTLY ADHERED TO THE
TENURES OF THE OHIO STATE UNIVERSITY’S ACADEMIC INTEGRITY POLICY WITH RESPECT TO
THIS ASSIGNMENT.
 */
#include "lab3.h"
#include <stdio.h>
void get_ingredients(char** list, int len) {
	int i;
	/*calls get_item for every index in list*/
	printf("Enter the %i ingredients one to a line: \n", len);
	for (i = 0; i<len; i++) {
		get_item(*(list + i), i);
	}
	print_ingredients(list, len);
}