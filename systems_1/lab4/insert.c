/* BY SUBMITTING THIS FILE TO CARMEN, I CERTIFY THAT I HAVE STRICTLY ADHERED TO THE
TENURES OF THE OHIO STATE UNIVERSITY�S ACADEMIC INTEGRITY POLICY WITH RESPECT TO
THIS ASSIGNMENT.
 */

#include <stdio.h>
#include <stdlib.h>
#include "lab4.h"
Node* insert(Node *head, Node *item) {
    if (head == NULL) {
        head = item;
    } else if (head->grocery_item.stockNumber<item->grocery_item.stockNumber) {
        item->next = head;
        return item;
    } else {
        Node *index = head;
        while (index->next != NULL && index->next->grocery_item.stockNumber>item->grocery_item.stockNumber) {
            index = index->next;
        }
        item->next = index->next;
        index->next = item;
    }
    return head;
}