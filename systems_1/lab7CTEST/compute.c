
#include <stdio.h>
#include <stdlib.h>
#include "lab7.h"
void
compute (struct Record *rptr, int count)
{
  int i;
  for (i = 0; i < count; i++)
    {
      struct Record *r = &rptr[i];
      r->difference = r->value1 - r->value2;
      r->sum = (long) r->value1 + r->value2;
      r->product = (long) r->value1 * r->value2;
      r->quotient = r->value1 / r->value2;
      r->remainder = r->value1 % r->value2;
    }
}