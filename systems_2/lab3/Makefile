#$< - references leftmost prerequisite
#$^ - references all prerequisites
#$@ - references rule name
#% - wildcard, whatever it's called as (e.g., lab3main.o) carries through to the prerequisite (e.g., lab3main.c)

LAB = lab3
#if all C names are labX make right side $(LAB)
C = main
all: $(LAB).zip $(LAB)
$(LAB).zip: Makefile $(C).c
	zip $@ $^
$(LAB): $(C).o
	gcc -o $(LAB) $^
%.o: %.c
	gcc -c $^
clean: 
	rm -rf *.o $(LAB) $(LAB).zip
	clear