/* BY SUBMITTING THIS FILE TO CARMEN, I CERTIFY THAT I HAVE STRICTLY ADHERED TO THE
TENURES OF THE OHIO STATE UNIVERSITY’S ACADEMIC INTEGRITY POLICY WITH RESPECT TO
THIS ASSIGNMENT.
 */
#include "lab3.h"
#include <stdio.h>

void get_item(char* item, int index) {
	/*prompts user for a string and then writes it to item*/
	/*printf("Enter ingredient %i: ", index);*/
	scanf(" %[^\n]%*c", item);
}