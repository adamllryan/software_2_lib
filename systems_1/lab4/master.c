
#include <stdio.h>
#include <stdlib.h>
struct Cost {
	float wholesalePrice;
	float retailPrice;
	int wholesaleQuantity;
	int retailQuantity;
};
struct Data {
	char item[50];
	char department[30];
	int stockNumber;
	struct Cost pricing;
};
typedef struct Node {
	struct Data grocery_item;
	struct Node *next;
} Node;
Node* create_node();
Node* insert(Node *head, Node *item);
Node* delete(Node *head, int index);
Node* read_inventory(char *argv[]);
void print_nodes(Node *n);
int option_1(Node* head);
int option_2(Node* head);
int option_3(Node* head);
int option_4(Node* head);
int option_5(Node* head);
int option_6(Node* head);
int option_7(Node* head);
int option_8(Node* head);
int option_9(Node* head);
int option_10(Node* head);
int option_11(Node* head);
int option_12(Node* head);
void prompt_date(int day, int year, char* argv[]);
int count_list(Node* head);
void run_options(Node* head);
int main(int argc, char *argv[])
{
    
    printf("Reading inventory from file \"%s\"\n", argv[2]);
    Node *data = read_inventory(argv);
    if (data!=NULL) {
        printf("A total of %i grocery items were read into inventory from the file \"%s\".\n", count_list(data), argv[2]);
        //data = delete(data, 9777);
        //print_nodes(data);
        run_options(data);
    }
    return 0;
}
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
int count_list(Node* head) {
    Node *index = head;
    int i = 0;
    while (index!=NULL) {
        index = index->next;
        i++;
    }
    return i;
}
void prompt_date(int day, int year, char* argv[]) {
    /*every month should be 30 days lol*/
    int d, m, y, days_since;
    sscanf(argv[1], "%d/%d/%d", &m, &d, &y);
    printf("There are %i days difference between the date entered and the date in the file. Do you wish to continue? ", (d+30*m+365*y)-(365*year+day));
}
Node* create_node() {
    Node *n = (Node*)malloc(sizeof(Node));
    return n;
}
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
Node* delete(Node *head, int stock_number) {
    if (head->grocery_item.stockNumber == stock_number) {
        Node *toDel = head;
        head = head->next;
        free(toDel);
    } else {
        Node *index = head;
        while (index->next->grocery_item.stockNumber != stock_number) {
            index = index->next;
        }
        Node *toDel = index->next;
        index->next = index->next->next;
        free(toDel);
    }
    return head;
}
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
int option_3(Node* head){
    float sum = 0;
    Node* index = head;
    while (index!=NULL) {
        sum +=(index->grocery_item.pricing.wholesaleQuantity-index->grocery_item.pricing.retailQuantity)*index->grocery_item.pricing.wholesalePrice;
        index = index->next;
    }
    printf("\nTotal Wholesale investment: %f\n", sum);
    return 0;
}
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
int option_5(Node* head){
    float sum = 0;
    Node* index = head;
    while (index!=NULL) {
        sum +=index->grocery_item.pricing.retailQuantity;
        index = index->next;
    }
    printf("\nTotal sales: %f\n", sum);
    return 0;
}
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
int option_7(Node* head){
    printf("I ran out of time");
}
int option_8(Node* head){
    printf("I ran out of time");
}
int option_9(Node* head){
    printf("I ran out of time");
}
int option_10(Node* head){
    printf("I ran out of time");
}
int option_11(Node* head){
    printf("I ran out of time");
}
int option_12(Node* head){
    return -1;
}

