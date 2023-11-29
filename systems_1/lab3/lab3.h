/* BY SUBMITTING THIS FILE TO CARMEN, I CERTIFY THAT I HAVE STRICTLY ADHERED TO THE
TENURES OF THE OHIO STATE UNIVERSITY’S ACADEMIC INTEGRITY POLICY WITH RESPECT TO
THIS ASSIGNMENT.
 */
#ifndef LAB3_H_
#define LAB3_H_

void print_ingredients(char** list, int len);

void get_ingredients(char** list, int len);

void get_item(char* item, int index);

void get_num_ingredients(int* location);

char*** get_thispizza(int* num_toppings, char*** pizza, char** ingredients);

void save_info(char** ingredients, char*** thispizza, int ingredients_len, int pizza_len);

void free_dmem(char** ingredients, int size, char*** pizza);

char** create_string_array(int size, int str_len);

void write_data(void *fp, char** ingredients, char*** thispizza, int ingredients_len, int pizza_len);

#endif