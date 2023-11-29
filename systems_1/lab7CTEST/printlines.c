
#include <stdio.h>
#include <stdlib.h>
#include "lab7.h"
void
printlines (struct Record *rptr, int count)
{
  int i;
  for (i = 0; i < count; i++)
    {
      printf ("%i + %i = %ld\n", rptr[i].value1, rptr[i].value2, rptr[i].sum);
      printf ("%i - %i = %i\n", rptr[i].value1, rptr[i].value2,
	      rptr[i].difference);
      printf ("%i * %i = %ld\n", rptr[i].value1, rptr[i].value2,
	      rptr[i].product);
      printf ("%i / %i = %i, %i\n\n", rptr[i].value1, rptr[i].value2,
	      rptr[i].quotient, rptr[i].remainder);
    }

}