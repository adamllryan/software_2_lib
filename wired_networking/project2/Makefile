#$< - references leftmost prerequisite
#$^ - references all prerequisites
#$@ - references rule name
# i stole this setup from my systems 2 makefiles
#% - wildcard,
FILES = $(wildcard *.c)
PROJECT = $(notdir $(CURDIR))
all: $(PROJECT).zip client
$(PROJECT).zip: Makefile $(FILES) 
	zip $@ $^
#%: %.o
#	gcc -o $(PROJECT) $^
client: client.o 
	gcc -o $@ $^
	rm -rf client.o
%.o: %.c
	gcc -c $^
clean: 
	rm -rf $(PROJECT).zip client
	clear
