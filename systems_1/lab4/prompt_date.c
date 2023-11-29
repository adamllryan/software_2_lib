/* BY SUBMITTING THIS FILE TO CARMEN, I CERTIFY THAT I HAVE STRICTLY ADHERED TO THE
TENURES OF THE OHIO STATE UNIVERSITY�S ACADEMIC INTEGRITY POLICY WITH RESPECT TO
THIS ASSIGNMENT.
 */

#include <stdio.h>
#include <stdlib.h>
#include "lab4.h"
void prompt_date(int day, int year, char* argv[]) {
    /*every month should be 30 days lol*/
    int d, m, y, days_since;
    sscanf(argv[1], "%d/%d/%d", &m, &d, &y);
    printf("There are %i days difference between the date entered and the date in the file. Do you wish to continue? ", (d+30*m+365*y)-(365*year+day));
}