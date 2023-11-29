#template from Piazza post

CFLAGS = -ansi -pedantic -Wimplicit-function-declaration -Wreturn-type -g
#all output files 
OBJ = lab3main.o get_ingredients.o get_item.o get_thispizza.o save_info.o free_dmem.o print_ingredients.o get_num_ingredients.o create_string_array.o write_data.o

all: lab3 lab3.zip

lab3.zip: *.c *.h Makefile LAB3README
	zip $@ $^

%.o: %.c *.h
	gcc -c $< -o $@ $(CFLAGS)

lab3: $(OBJ)
	gcc $^ -o $@ $(CFLAGS)

clean:
	rm -rf *.o lab3 lab3.zip
	clear

#Character Reference list pulled from piazza post
#$< - references leftmost prerequisite
#$^ - references all prerequisites
#$@ - references rule name
#% - wildcard, whatever it's called as (e.g., lab3main.o) carries through to the prerequisite (e.g., lab3main.c)