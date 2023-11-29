struct Record
{
  int value2;
  int value1;
  int difference;
  long sum;
  long product;
  int quotient;
  int remainder;
};
void printlines(struct Record *rptr, int count);
void compute(struct Record *rptr, int count);
void readlines(FILE *fptr, struct Record *rptr, int count);