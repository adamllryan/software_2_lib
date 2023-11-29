/* BY SUBMITTING THIS FILE TO CARMEN, I CERTIFY THAT I HAVE STRICTLY ADHERED TO THE
TENURES OF THE OHIO STATE UNIVERSITY�S ACADEMIC INTEGRITY POLICY WITH RESPECT TO
THIS ASSIGNMENT.
 */

#include <stdio.h>
#include <stdlib.h>
#include "lab4.h"
int option_1(Node* head){
    float sum = 0;
    Node* index = head;
    while (index!=NULL) {
        sum +=index->grocery_item.pricing.retailQuantity*index->grocery_item.pricing.retailPrice;
        index = index->next;
    }
    printf("\nTotal revenue: %f\n", sum);
    return 0;
}