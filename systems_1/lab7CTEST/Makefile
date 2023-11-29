# BY SUBMITTING THIS FILE TO CARMEN, I CERTIFY THAT I STRICTLY ADHERED TO THE
# TENURES OF THE OHIO STATE UNIVERSITY’S ACADEMIC INTEGRITY POLICY.
# THIS IS THE README FILE FOR LAB 6.
#Adam Ryan


CFLAGS = -ansi -pedantic -Wimplicit-function-declaration -Wreturn-type -g 
#all output files 
OBJ = compute.o printlines.o readlines.o readrec.o
all: readrec lab7.zip

lab7.zip: *.c *.h Makefile LAB7README
	zip $@ $^

%.o: %.c *.h
	gcc -c $< -o $@ $(CFLAGS)

readrec: $(OBJ)
	gcc $^ -o $@ $(CFLAGS)

clean:
	rm -rf *.o readrec lab7.zip
	clear