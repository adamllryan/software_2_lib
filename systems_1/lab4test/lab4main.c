/* BY SUBMITTING THIS FILE TO CARMEN, I CERTIFY THAT I HAVE STRICTLY ADHERED TO THE
TENURES OF THE OHIO STATE UNIVERSITY�S ACADEMIC INTEGRITY POLICY WITH RESPECT TO
THIS ASSIGNMENT.
 */

#include <stdio.h>
#include <stdlib.h>
#include "lab4.h"

int main(int argc, char *argv[])
{
    Node *data;
    printf("Reading inventory from file \"%s\"\n", argv[2]);
    data = read_inventory(argv);
    if (data!=NULL) {
        printf("A total of %i grocery items were read into inventory from the file \"%s\".\n", count_list(data), argv[2]);
        /*data = delete(data, 9777);*/
        /*print_nodes(data);*/
        run_options(data);
    }
    return 0;
}