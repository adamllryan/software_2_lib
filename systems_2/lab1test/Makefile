#$< - references leftmost prerequisite
#$^ - references all prerequisites
#$@ - references rule name
#% - wildcard, whatever it's called as (e.g., lab3main.o) carries through to the prerequisite (e.g., lab3main.c)
all: lab1.zip lab1
lab1.zip: Makefile lab1.c
	zip $@ $^
lab1: lab1.o
	gcc -o lab1 $^
%.o: %.c
	gcc -c $^
clean: 
	rm -rf *.o lab1 lab1.zip
	clear