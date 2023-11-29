# BY SUBMITTING THIS FILE TO CARMEN, I CERTIFY THAT I STRICTLY ADHERED TO THE
# TENURES OF THE OHIO STATE UNIVERSITY’S ACADEMIC INTEGRITY POLICY.
# THIS IS THE README FILE FOR LAB 6.
.file "rotate_right.s"
# .section .rodata
.text
.globl rotate_right
    .type rotate_right, @function
rotate_right:
    pushq %rbp
    movq %rsp, %rbp
    
    pushq %r13 # i want %r13 and %r14
    pushq %r14

    xorq %rax, %rax # rax = 0

    # math

    movb %dil, %r13b   # copy param 1 to r13
    movb %dil, %al # copy param 1 to rax

    sarb $1, %al # shift param 1 right
    salb $7, %r13b # shift param 1 left
    andb $128, %r13b # we only want the digit in 128s position

    orb %r13b, %al # combine the two shifts

    # restore
    
    popq %r14 # restore registers
    popq %r13
    leave
ret
