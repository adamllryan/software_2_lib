/* BY SUBMITTING THIS FILE TO CARMEN, I CERTIFY THAT I HAVE STRICTLY ADHERED TO THE
TENURES OF THE OHIO STATE UNIVERSITY’S ACADEMIC INTEGRITY POLICY WITH RESPECT TO
THIS ASSIGNMENT.
 */
#ifndef LAB4_H_
#define LAB4_H_

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
#endif