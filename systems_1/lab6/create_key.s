# BY SUBMITTING THIS FILE TO CARMEN, I CERTIFY THAT I STRICTLY ADHERED TO THE
# TENURES OF THE OHIO STATE UNIVERSITY’S ACADEMIC INTEGRITY POLICY.
# THIS IS THE README FILE FOR LAB 6.
.file "create_key.s"
.section .rodata
printf_line:
    .string "enter 4-bit key: "
    .data
    .align 8
    .text
    .globl create_key
    .type create_key, @function
create_key:
    pushq %rbp
    movq %rsp, %rbp

    pushq %r12

	movl	$0, %r12d

	movl	$printf_line, %edi # move string to parameter 1
	call	printf 

    movq $0, %r13 # I use r%r13 as loop counter

	jmp	CONT # jump to condition statement
LOOP:

	sall	%r12d # shift left
	call	getchar # get next char
	andl	$1, %eax # %eax&1 will return if char is a 1 or 0, can also do %eax - '0'
	orl	%eax, %r12d # combine char with %r12
    incq %r13 # increment counter

CONT:
	cmpq	$4, %r13 # compare 4 to value in %r13
	jl	LOOP # if %r13<4 then continue

	movl	%r12d, %eax # move %r12
	sall	$4, %eax
	orl	%r12d, %eax
    
    popq %r12
    leave
ret
