/* BY SUBMITTING THIS FILE TO CARMEN, I CERTIFY THAT I HAVE STRICTLY ADHERED
** TO THE TENURES OF THE OHIO STATE UNIVERSITY’S ACADEMIC INTEGRITY POLICY
** WITH RESPECT TO THIS ASSIGNMENT.
 */ 
/*Adam Ryan*/
#include <stdio.h>

/*duplicates 4 bit key across 8 bits*/
int create_key(char value) {
	/*printf("value = %i\n", value);*/
	return (value<<4) | value;
}
/*rotates value 1 to the left*/
int rotate_left(int value) {
	/*printf("Before left rotate: %x\n", value);*/
	int size = 255;
	int result = (value<<1 & size) | value>>7;
	/*printf("Post left rotate: %x\n", result);*/
	return result;
}
/*rotates value 1 to the right*/
int rotate_right(int value) {
	/*printf("Before right rotate: %x\n", value);*/
	int size = 255;
	int result = value>>1 | (size & value<<7);
	/*printf("Post right rotate: %x\n", result);*/
	return value>>1 | (size & value<<7);
}
/*reverses encryption algorithm based on order and key*/
int decrypt(int value, int key, int rotation) {
	int result = rotation ? rotate_left(value) : rotate_right(value);
	result = result ^ key;
	return result;
}
/*returns the value of the input code*/
int read_digits() {
    int input, i;
    /*we know it is 4 chars long*/
	for (i = 0; i<4; i++) { 
		input <<=1;
		/*we only need the smallest digit*/
		input |= getchar() & 1; 
		/*printf("input: %i\n", input);*/
	}
	return input;
}
/*prints out decoded characters as they are processed*/
void read_code(int key) {
    int temp, i;
    /*read the hex values, max 200 entries*/
	for (i = 0; i<200; i++) {
		scanf("%2x", &temp);
		/*printf("%x ", temp);*/
		putchar(decrypt(temp, key, i%2));
		if (getchar() == '\n') {
			break;
		}
	}
}
int main()
{
	char input, key;
	/*collect the encryption key*/
#ifdef PROMPT
	printf("enter 4-bit key: ");
#endif
	input = read_digits();
	key = create_key(input);
	/*collect encoded text*/
#ifdef PROMPT
	printf("enter encoded text: ");
#endif
	/*need to drop the extra '\n' from previous input*/
	getchar();
	read_code(key); 
	putchar('\n');
	return 0;
}