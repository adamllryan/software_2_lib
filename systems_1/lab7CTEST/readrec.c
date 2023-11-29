
#include <stdio.h>
#include <stdlib.h>
#include "lab7.h"

int
main (int argc, char **argv)
{
  int count = atoi(argv[1]);
  FILE *f;
  int i;
  char *file = argv[2];
  struct Record *r =
    (struct Record *) malloc (sizeof (struct Record) * count);
  if (r == NULL)
    return EXIT_FAILURE;
  f = fopen (file, "r");
  readlines (f, r, count);
  fclose (f);
  compute (r, count);
  printlines (r, count);
  free (r);
  return EXIT_SUCCESS;
}
