# BY SUBMITTING THIS FILE TO CARMEN, I CERTIFY THAT I STRICTLY ADHERED TO THE
# TENURES OF THE OHIO STATE UNIVERSITY’S ACADEMIC INTEGRITY POLICY.
# THIS IS THE README FILE FOR LAB 6.
#Adam Ryan
gcc_Copt = -ansi -pedantic -g -Wimplicit-function-declaration -Wreturn-type -c
gcc_Sopt = -lc -m64 -c -g -pedantic

OBJ = readrec.s compute.s printlines.s readlines.s
OBJO = readrec.o compute.o printlines.o readlines.o
all: lab7.zip readrec
lab7.zip: $(OBJ) LAB7README Makefile
	zip $@ $(OBJ) LAB7README Makefile
readrec: $(OBJO)
	gcc $^ -o $@
%.o: %.s
	gcc $(gcc_Copt) $^
clean:
	rm -rf *.o readrec lab7.zip
	clear