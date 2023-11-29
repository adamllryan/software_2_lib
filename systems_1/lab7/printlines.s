
# BY SUBMITTING THIS FILE TO CARMEN, I CERTIFY THAT I STRICTLY ADHERED TO THE
# TENURES OF THE OHIO STATE UNIVERSITY’S ACADEMIC INTEGRITY POLICY.
# THIS IS THE README FILE FOR LAB 7.
# Adam Ryan
.file "printlines.s"
.section .rodata

addition:
	.string	"%i + %i = %ld\n"
subtraction:
	.string	"%i - %i = %i\n"
multiplication:
	.string	"%i * %i = %ld\n"
division:
	.string	"%i / %i = %i, %i\n\n"
	.text
.globl printlines
.type printlines, @function
printlines:
    pushq	%rbp
	movq	%rsp, %rbp
    pushq %r12
    movq %rsi, %r12 # r12 is loop counter
    pushq %r13
    movq %rdi, %r13
while:
    # addition print
    movq $addition, %rdi
    movq 16(%r13), %rsi
    movq 20(%r13), %rdx
    movq (%r13), %rcx
    call printf
    # subtraction print
    movq $subtraction, %rdi
    movq 16(%r13), %rsi
    movq 20(%r13), %rdx
    movq 24(%r13), %rcx
    call printf
    # multiplication print
    movq $multiplication, %rdi
    movq 16(%r13), %rsi
    movq 20(%r13), %rdx
    movq 8(%r13), %rcx
    call printf
    # division print
    movq $division, %rdi
    movq 16(%r13), %rsi
    movq 20(%r13), %rdx
    movq 28(%r13), %rcx
    movq 32(%r13), %r8
    call printf
    # increment Record pointer

    addq $40, %r13
    decq %r12 # exit when zero
    je end
    jmp while
end: 
    popq %r13
    popq %r12
    leave
	ret
