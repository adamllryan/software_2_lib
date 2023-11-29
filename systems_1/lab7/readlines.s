
# BY SUBMITTING THIS FILE TO CARMEN, I CERTIFY THAT I STRICTLY ADHERED TO THE
# TENURES OF THE OHIO STATE UNIVERSITY’S ACADEMIC INTEGRITY POLICY.
# THIS IS THE README FILE FOR LAB 7.
# Adam Ryan
.file "readlines.s"
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

format: 
    .string "%i %i"
    .text

.globl readlines
.type readlines, @function
readlines:
    pushq	%rbp
	movq	%rsp, %rbp

    pushq %r12
    movq %rdx, %r12 # r12 is loop counter
    pushq %r13
    movq %rsi, %r13 # Record pointer
    pushq %r14
    movq %rdi, %r14 # file pointer
while:
    # empty array
    movq $record, (%r13)

    movq %r14, %rdi # file pointer
    movq $format, %rsi # format
    leaq (%r13), %rdx # num1
    addq $16, %rdx
    leaq (%r13), %rcx # num2
    addq $20, %rcx
    call fscanf
    addq $40, %r13
    decq %r12 # exit when zero
    je end
    jmp while
end: 
    popq %r14
    popq %r13
    popq %r12


    leave
	ret
