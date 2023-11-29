	.file	"compute.c"
	.text
	.globl	compute
	.type	compute, @function
compute:
	pushq	%rbp
	movq	%rsp, %rbp
	pushq	%rbx
	movq	%rdi, -32(%rbp)
	movl	%esi, -36(%rbp)
	movl	$0, -12(%rbp)
	jmp	.L2
.L3:
	movl	-12(%rbp), %eax
	movslq	%eax, %rdx
	movq	%rdx, %rax
	salq	$2, %rax
	addq	%rdx, %rax
	salq	$3, %rax
	movq	%rax, %rdx
	movq	-32(%rbp), %rax
	addq	%rdx, %rax
	movq	%rax, -24(%rbp)
	movq	-24(%rbp), %rax
	movl	4(%rax), %edx
	movq	-24(%rbp), %rax
	movl	(%rax), %eax
	subl	%eax, %edx
	movq	-24(%rbp), %rax
	movl	%edx, 8(%rax)
	movq	-24(%rbp), %rax
	movl	4(%rax), %eax
	movslq	%eax, %rdx
	movq	-24(%rbp), %rax
	movl	(%rax), %eax
	cltq
	addq	%rax, %rdx
	movq	-24(%rbp), %rax
	movq	%rdx, 16(%rax)
	movq	-24(%rbp), %rax
	movl	4(%rax), %eax
	movslq	%eax, %rdx
	movq	-24(%rbp), %rax
	movl	(%rax), %eax
	cltq
	imulq	%rax, %rdx
	movq	-24(%rbp), %rax
	movq	%rdx, 24(%rax)
	movq	-24(%rbp), %rax
	movl	4(%rax), %eax
	movq	-24(%rbp), %rdx
	movl	(%rdx), %ebx
	cltd
	idivl	%ebx
	movl	%eax, %edx
	movq	-24(%rbp), %rax
	movl	%edx, 32(%rax)
	movq	-24(%rbp), %rax
	movl	4(%rax), %eax
	movq	-24(%rbp), %rdx
	movl	(%rdx), %ecx
	cltd
	idivl	%ecx
	movq	-24(%rbp), %rax
	movl	%edx, 36(%rax)
	addl	$1, -12(%rbp)
.L2:
	movl	-12(%rbp), %eax
	cmpl	-36(%rbp), %eax
	jl	.L3
	popq	%rbx
	popq	%rbp
	ret
	.size	compute, .-compute
	.ident	"GCC: (GNU) 4.8.5 20150623 (Red Hat 4.8.5-44)"
	.section	.note.GNU-stack,"",@progbits
