/* BY SUBMITTING THIS FILE TO CARMEN, I CERTIFY THAT I HAVE STRICTLY ADHERED TO THE
TENURES OF THE OHIO STATE UNIVERSITY�S ACADEMIC INTEGRITY POLICY WITH RESPECT TO
THIS ASSIGNMENT.
 */

#include <stdio.h>
#include <stdlib.h>
#include "lab4.h"
Node* delete(Node *head, int stock_number) {
    Node *toDel, *index;
    if (head->grocery_item.stockNumber == stock_number) {
        Node *toDel = head;
        head = head->next;
        free(toDel);
    } else {
        index = head;
        while (index->next->grocery_item.stockNumber != stock_number) {
            index = index->next;
        }
        toDel = index->next;
        index->next = index->next->next;
        free(toDel);
    }
    return head;
}