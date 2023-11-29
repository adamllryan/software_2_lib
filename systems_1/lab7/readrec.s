
# BY SUBMITTING THIS FILE TO CARMEN, I CERTIFY THAT I STRICTLY ADHERED TO THE
# TENURES OF THE OHIO STATE UNIVERSITY’S ACADEMIC INTEGRITY POLICY.
# THIS IS THE README FILE FOR LAB 7.
# Adam Ryan
.file "readrec.s"
.section .rodata
.data
record:
	.align 8
	.quad 0 # sum +0
	.quad 0 # product +8
	.long 0 # value 2 +16
	.long 0 # value1 +20
	.long 0 # diff +24
	.long 0 # quotient +28
	.long 0 # remainedr +32
read_mode:
	.string "r"
	.text

	.globl main
	.type main, @function
main:
	pushq %rbp # stack frame setup
	movq %rsp, %rbp

	# R12 = int count
	# R13 = char *file
	# R14 = FILE *f
	# R15 = struct Record *r
	xorq %r12, %r12
	xorq %r13, %r13
	xorq %r14, %r14
	xorq %r15, %r15
	# argc is going to be in rdi
	# argv[] is going to be in rsi
	# pushq %rdi
	
	movq $1, %rcx
	movq (%rsi,%rcx,8), %rdi
	pushq %rsi
	call atoi
	movl %eax, %r12d # COUNT IN r12
	popq %rsi

	movq $2, %rcx
	leaq (%rsi,%rcx,8),%r13 # SAVE CHAR PTR IN r13

	# allocate Record array
	xorq %rdi, %rdi
	movl %r12d, %edi
	imulq $40, %rdi
	call malloc
	movq %rax, %r15 # RECORD POINTER IN r15

	cmpq $0, %rax
	je exit # if malloc returns zero exit program

	movq (%r13), %rdi # char *file into 1st
	movq $read_mode, %rsi # "r" into 2nd

	call fopen
	movq %rax, %r14 # FILE VARIABLE IN r14

	movq %r14, %rdi # FILE into 1st
	movq %r15, %rsi # r* into 2nd
	movl %r12d, %edx # int count into 3rd
	call readlines

	movq %r14, %rdi # FILE into 1st
	# call fclose

	movq %r15, %rdi # r* into 1st
	movl %r12d, %esi # int count into 2nd
	call compute

	movq %r15, %rdi # r* int 1st
	movl %r12d, %esi # int count into 2nd
	call printlines

	movq %r15, %rdi # r* into 1st
	call free
	# movq $0, %rax
exit: 
	leave # reset frame
	ret
