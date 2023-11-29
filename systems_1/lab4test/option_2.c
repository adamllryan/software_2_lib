/* BY SUBMITTING THIS FILE TO CARMEN, I CERTIFY THAT I HAVE STRICTLY ADHERED TO THE
TENURES OF THE OHIO STATE UNIVERSITY�S ACADEMIC INTEGRITY POLICY WITH RESPECT TO
THIS ASSIGNMENT.
 */

#include <stdio.h>
#include <stdlib.h>
#include "lab4.h"
int option_2(Node* head){
    float sum = 0;
    Node* index = head;
    while (index!=NULL) {
        sum +=index->grocery_item.pricing.wholesaleQuantity*index->grocery_item.pricing.wholesalePrice;
        index = index->next;
    }
    printf("\nTotal wholesale Cost: %f\n", sum);
    return 0;
}