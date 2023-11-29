/* BY SUBMITTING THIS FILE TO CARMEN, I CERTIFY THAT I HAVE STRICTLY ADHERED TO THE
TENURES OF THE OHIO STATE UNIVERSITY�S ACADEMIC INTEGRITY POLICY WITH RESPECT TO
THIS ASSIGNMENT.
 */

#include <stdio.h>
#include <stdlib.h>
#include "lab4.h"
Node* read_inventory(char* argv[]) {
    Node *n = NULL;
    int day, year;
    FILE *f = fopen(argv[2], "r");
    fscanf(f, "%3i\t%i\n", &day, &year);
    prompt_date(day, year, argv);
    while (1) {
        Node *temp = create_node();
        char *item, *department;
        fscanf(f, "%[^\t]\t%[^\t]\t%i\t%f\t%f\t%i\t%i\n", temp->grocery_item.
            item, temp->grocery_item.department, &temp->grocery_item.
                stockNumber, &temp->grocery_item.pricing.retailPrice, &temp->
                    grocery_item.pricing.wholesalePrice, &temp->grocery_item.
                        pricing.retailQuantity, &temp->grocery_item.pricing.
                            wholesaleQuantity);
        if (temp->grocery_item.stockNumber==0) {
            free(temp);
            break;
        }
        n = insert(n, temp);
    }
    fclose(f);
    return n;
}