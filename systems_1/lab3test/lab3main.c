/* BY SUBMITTING THIS FILE TO CARMEN, I CERTIFY THAT I HAVE STRICTLY ADHERED TO THE
TENURES OF THE OHIO STATE UNIVERSITY’S ACADEMIC INTEGRITY POLICY WITH RESPECT TO
THIS ASSIGNMENT.
 */
#include "lab3.h"
#include <stdio.h>
#include <stdlib.h>

int main() {
	
	int i;

	/*Ingredients and number of them*/
	char **ingredients;
	int num_ingredients;

	/*User Pizza and number of toppings*/
	char ***thispizza;
	int ingredients_on_pizza;
	
	int user_choice;
	
	/*Get number of ingredients from user*/
	get_num_ingredients(&num_ingredients);

	/*Allocate Array, +1 for termination char*/
	ingredients = create_string_array(num_ingredients, 61);
	
	get_ingredients(ingredients, num_ingredients);

	
	thispizza = get_thispizza(&ingredients_on_pizza, thispizza, ingredients);

	printf("Do you want to save them? (1=yes, 2=no): ");
	scanf(" %1i", &user_choice);
	if (user_choice==1) {
		save_info(ingredients, thispizza, num_ingredients, ingredients_on_pizza);
	}
	
	free_dmem(ingredients, num_ingredients, thispizza);

	return EXIT_SUCCESS;
}