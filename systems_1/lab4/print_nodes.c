/* BY SUBMITTING THIS FILE TO CARMEN, I CERTIFY THAT I HAVE STRICTLY ADHERED TO THE
TENURES OF THE OHIO STATE UNIVERSITY�S ACADEMIC INTEGRITY POLICY WITH RESPECT TO
THIS ASSIGNMENT.
 */

#include <stdio.h>
#include <stdlib.h>
#include "lab4.h"
void print_nodes(Node *n) {
    Node *index = n;
    while (index != NULL) {
        printf("Item: %s\t%s\t%i\t%f\t%f\t%i\t%i\n", index->grocery_item.item, 
            index->grocery_item.department, index->grocery_item.stockNumber, 
                index->grocery_item.pricing.retailPrice, index->grocery_item.
                    pricing.wholesalePrice, index->grocery_item.pricing.
                        retailQuantity, index->grocery_item.pricing.
                            wholesaleQuantity);
        index = index->next;
    }
}