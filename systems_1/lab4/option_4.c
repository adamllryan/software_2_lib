/* BY SUBMITTING THIS FILE TO CARMEN, I CERTIFY THAT I HAVE STRICTLY ADHERED TO THE
TENURES OF THE OHIO STATE UNIVERSITY�S ACADEMIC INTEGRITY POLICY WITH RESPECT TO
THIS ASSIGNMENT.
 */

#include <stdio.h>
#include <stdlib.h>
#include "lab4.h"
int option_4(Node* head){
    float revenue = 0, cost = 0;
    Node* index = head;
    while (index!=NULL) {
        revenue +=index->grocery_item.pricing.retailQuantity*index->grocery_item.pricing.retailPrice;
        cost += index->grocery_item.pricing.wholesaleQuantity*index->grocery_item.pricing.wholesalePrice;
        index = index->next;
    }
    printf("\nTotal profit: %f\n", revenue-cost);
    return 0;
}