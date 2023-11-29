
# BY SUBMITTING THIS FILE TO CARMEN, I CERTIFY THAT I STRICTLY ADHERED TO THE
# TENURES OF THE OHIO STATE UNIVERSITY’S ACADEMIC INTEGRITY POLICY.
# THIS IS THE README FILE FOR LAB 7.
# Adam Ryan
.file "compute.s"
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

.globl compute
.type compute, @function
compute:
    pushq	%rbp
	movq	%rsp, %rbp





    leave
	ret
