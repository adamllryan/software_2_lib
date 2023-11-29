/* BY SUBMITTING THIS FILE TO CARMEN, I CERTIFY THAT I HAVE STRICTLY ADHERED TO THE
TENURES OF THE OHIO STATE UNIVERSITY�S ACADEMIC INTEGRITY POLICY WITH RESPECT TO
THIS ASSIGNMENT.
 */

#include <stdio.h>
#include <stdlib.h>
#include "lab4.h"
int option_6(Node* head){
    float profit, sales, revenue, cost;
    Node* index = head;
    while (index!=NULL) {
        revenue +=index->grocery_item.pricing.retailQuantity*index->grocery_item.pricing.retailPrice;
        cost += index->grocery_item.pricing.wholesaleQuantity*index->grocery_item.pricing.wholesalePrice;
        sales += index->grocery_item.pricing.retailQuantity;
        index = index->next;
    }
    printf("\nTotal profit: %f\n", (revenue-cost)/sales);
    return 0;
}