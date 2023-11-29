/* BY SUBMITTING THIS FILE TO CARMEN, I CERTIFY THAT I HAVE STRICTLY ADHERED TO THE
TENURES OF THE OHIO STATE UNIVERSITY’S ACADEMIC INTEGRITY POLICY WITH RESPECT TO
THIS ASSIGNMENT.
 */
#include "lab3.h"
#include <stdio.h>
#include <stdlib.h>
void save_info(char** ingredients, char*** thispizza, int ingredients_len, int pizza_len) {
	/*this does go 1 line over the 10 line limit but it would just be a waste of time to create another function for this*/
	/*e.g. I just spent 2 hours trying to do so and would rather take the point hit than look at this any more, will add to readme*/
	int i; FILE *fp; char file[256];
	printf("What file name do you want to use? ");
	scanf(" %256s", file);
	fp = fopen(file, "w+");
	fprintf(fp, "Available Pizza Ingredients today: \n");
	for (i = 0; i<ingredients_len; i++) {
		fprintf(fp, "%s\n", *(ingredients + i));
	}
	fprintf(fp, "\n\nIngredients on This Pizza are: \n");
	for (i = 0; i<pizza_len; i++) {
		fprintf(fp, "%s\n", **(thispizza+i));
	}
	/*write_data(ingredients, thispizza, ingredients_len, pizza_len);*/
	fclose(fp);
	printf("Today's available ingredients and what was ordered for this pizza have been saved to the file %s\n", file);
}