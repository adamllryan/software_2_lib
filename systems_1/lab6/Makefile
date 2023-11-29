# BY SUBMITTING THIS FILE TO CARMEN, I CERTIFY THAT I STRICTLY ADHERED TO THE
# TENURES OF THE OHIO STATE UNIVERSITY’S ACADEMIC INTEGRITY POLICY.
# THIS IS THE README FILE FOR LAB 6.
#Adam Ryan
gcc_Copt = -ansi -pedantic -g -Wimplicit-function-declaration -Wreturn-type -c
gcc_Sopt = -lc -m64 -c -g

OBJS = create_key.s rotate_left.s rotate_right.s
OBJC = bit_decode.c
OBJO = rotate_right.o rotate_left.o create_key.o bit_decode.o
all: lab6.zip bit_decode
lab6.zip: Makefile LAB6README $(OBJS) $(OBJC)
	zip lab6.zip Makefile LAB6README $(OBJS) $(OBJC)
bit_decode: $(OBJO)
	gcc $(OBJO) -o bit_decode
bit_decode.o: $(OBJC)
	gcc $(gcc_Copt) $(OBJC)
rotate_right.o: rotate_right.s 
	gcc $(gcc_Sopt) rotate_right.s
rotate_left.o: rotate_left.s 
	gcc $(gcc_Sopt) rotate_left.s
create_key.o: create_key.s 
	gcc $(gcc_Sopt) create_key.s
clean:
	rm -rf *.o bit_decode lab6.zip
	clear