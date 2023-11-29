#$< - references leftmost prerequisite
#$^ - references all prerequisites
#$@ - references rule name
#% - wildcard, whatever it's called as (e.g., lab3main.o) carries through to the prerequisite (e.g., lab3main.c)

LAB = lab4
#if all C names are labX make right side $(LAB)
C = parallel1 parallel2 parallel3 createThreads
all: $(LAB).zip $(C)
	zip lab4 Makefile parallel1.c parallel2.c parallel3.c createThreads.c 
parallel1: parallel1.c
	gcc -pthread -o parallel1 parallel1.c
parallel2: parallel2.c
	gcc -pthread -o parallel2 parallel2.c
parallel3: parallel3.c
	gcc -pthread -o parallel3 parallel3.c
createThreads: createThreads.c
	gcc -pthread -o createThreads createThreads.c
clean: 
	rm -rf *.o $(LAB) $(LAB).zip $(C)
	clear
