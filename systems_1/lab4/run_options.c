/* BY SUBMITTING THIS FILE TO CARMEN, I CERTIFY THAT I HAVE STRICTLY ADHERED TO THE
TENURES OF THE OHIO STATE UNIVERSITY�S ACADEMIC INTEGRITY POLICY WITH RESPECT TO
THIS ASSIGNMENT.
 */

#include <stdio.h>
#include <stdlib.h>
#include "lab4.h"
void run_options(Node* head) {
    int (*user_choice[12])() = {option_1, option_2, option_3, option_4, 
        option_5, option_6, option_7, option_8, option_9, option_10, option_11, 
            option_12}, choice;
    while (1) {
    printf("Please enter an integer between 1 and 12:\n1) Print Total Revenue\n2) Print Total Wholesale Cost\n3) Print Current Grocery Item Investment\n4) Print Current Profit\n5) Print Total Number of Grocery Items Sold\n6) Print Average Profit per Grocery Item\n7) Print Grocery Items In Stock\n8) Print Out of Stock Grocery Items\n9) Print Grocery Items for a Department\n10) Add Grocery Item to Inventory\n11) Delete Grocery Item from Inventory\n12) Exit Program\nOption: ");
    scanf(" %i", &choice);
    if (user_choice[choice-1](head)==-1)
        break;
    }    
}