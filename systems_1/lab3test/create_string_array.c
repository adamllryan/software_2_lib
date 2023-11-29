/* BY SUBMITTING THIS FILE TO CARMEN, I CERTIFY THAT I HAVE STRICTLY ADHERED TO THE
TENURES OF THE OHIO STATE UNIVERSITY’S ACADEMIC INTEGRITY POLICY WITH RESPECT TO
THIS ASSIGNMENT.
 */
#include "lab3.h"
#include <stdlib.h>
char** create_string_array(int size, int str_len) {
	int i;	
	/*return char array given string length and elements*/
	char **array = malloc(sizeof(char*) * size);
	for (i = 0; i<size; i++) {
		*(array+i) = malloc(str_len * sizeof(char));
	}
	return array;
}