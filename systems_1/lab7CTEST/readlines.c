
#include <stdio.h>
#include <stdlib.h>
#include "lab7.h"
void
readlines (FILE *fptr, struct Record *rptr, int count)
{
  int i;
  for (i = 0; i < count; i++)
      fscanf (fptr, "%i %i", &rptr[i].value1, &rptr[i].value2);
}