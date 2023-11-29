#$< - references leftmost prerequisite
#$^ - references all prerequisites
#$@ - references rule name
# i stole this setup from my systems 2 makefiles
#% - wildcard,
FILES = $(wildcard *.c)
PROJECT = $(notdir $(CURDIR))
all: $(PROJECT).zip server client
$(PROJECT).zip: Makefile $(FILES) 
	zip $@ $^
#%: %.o
#	gcc -o $(PROJECT) $^
server: ftps.o
	gcc -o $@ $^
	rm -rf ftps.o
client: ftpc.o
	gcc -o $@ $^
	rm -rf ftpc.o
%.o: %.c
	gcc -c $^
clean: 
	rm -rf $(PROJECT).zip server client
	clear
