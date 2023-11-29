# BY SUBMITTING THIS FILE TO CARMEN, I CERTIFY THAT I STRICTLY ADHERED TO THE
# TENURES OF THE OHIO STATE UNIVERSITY’S ACADEMIC INTEGRITY POLICY.
# THIS IS THE README FILE FOR LAB 6.
.file "rotate_left.s"
# .section
.text
.globl rotate_left
    .type rotate_left, @function
rotate_left:
    pushq %rbp
    movq %rsp, %rbp
    
    pushq %r13 # i want to use %r13 and %r14
    pushq %r14 

    xorq %rax, %rax # reset rax to 0

    # math

    movb %dil, %r13b   # copy param 1 to r13
    movb %dil, %al # copy param 1 to rax

    salb $1, %r13b   # shift param 1 right
    shrb $7, %al   # shift param 7 right
    andb $1, %al # we only want the digit in 1s position

    orb %r13b, %al  # or the left shift and rotated value to get final value

    # restore

    popq %r14
    popq %r13 # restore used registers
    leave
ret
