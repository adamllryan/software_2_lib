#template from Piazza post

CFLAGS = -ansi -pedantic -Wimplicit-function-declaration -Wreturn-type -g
#all output files 
OBJ = lab4main.o read_inventory.o option_1.o option_2.o option_3.o option_4.o option_5.o option_6.o option_7.o option_8.o option_9.o option_10.o option_11.o option_12.o print_nodes.o delete.o insert.o create_node.o run_options.o prompt_date.o count_list.o
all: lab4 lab4.zip

lab4.zip: *.c *.h Makefile LAB4README
	zip $@ $^

%.o: %.c *.h
	gcc -c $< -o $@ $(CFLAGS)

lab4: $(OBJ)
	gcc $^ -o $@ $(CFLAGS)

clean:
	rm -rf *.o lab4 lab4.zip
	clear

#Character Reference list pulled from piazza post
#$< - references leftmost prerequisite
#$^ - references all prerequisites
#$@ - references rule name
#% - wildcard, whatever it's called as (e.g., lab3main.o) carries through to the prerequisite (e.g., lab3main.c)