gcc_opt = -ansi -pedantic -Wimplicit-function-declaration -Wreturn-type -g -c -D DEBUG

all: lab1.zip lab1

lab1.zip: Makefile lab1.c lab1_func.c local_file.h LAB1README lab1.input1 lab1.input2 verify

	zip lab1.zip Makefile lab1.c lab1_func.c local_file.h LAB1README lab1.input1 lab1.input2 verify

lab1: lab1.o lab1_func.o

	gcc lab1.o lab1_func.o -o lab1

lab1.o: lab1.c local_file.h

	gcc $(gcc_opt) lab1.c

lab1_func.o: lab1_func.c local_file.h

	gcc $(gcc_opt) lab1_func.c

clean: 
	rm -rf *.o lab1 lab1.zip

test: 
	./verify

