	.file	"get_thispizza.c"
	.section	.rodata
.LC0:
	.string	" %i"
	.align 8
.LC1:
	.string	"Enter the number next to each ingredient you want on your pizza: "
.LC2:
	.string	"%i"
	.align 8
.LC3:
	.string	"The ingredients on your pizza will be"
.LC4:
	.string	"%i. %s\n"
	.text
	.globl	get_thispizza
	.type	get_thispizza, @function
get_thispizza:
.LFB2:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$64, %rsp
	movq	%rdi, -40(%rbp)
	movq	%rsi, -48(%rbp)
	movq	%rdx, -56(%rbp)
	movq	-40(%rbp), %rax
	movq	%rax, %rsi
	movl	$.LC0, %edi
	movl	$0, %eax
	call	__isoc99_scanf
	movq	-40(%rbp), %rax
	movl	(%rax), %eax
	cltq
	salq	$3, %rax
	movq	%rax, %rdi
	call	malloc
	movq	%rax, -16(%rbp)
	movl	$.LC1, %edi
	movl	$0, %eax
	call	printf
	movl	$0, -4(%rbp)
	jmp	.L2
.L3:
	leaq	-20(%rbp), %rax
	movq	%rax, %rsi
	movl	$.LC2, %edi
	movl	$0, %eax
	call	__isoc99_scanf
	movl	-4(%rbp), %eax
	cltq
	leaq	0(,%rax,8), %rdx
	movq	-16(%rbp), %rax
	addq	%rdx, %rax
	movl	-20(%rbp), %edx
	movslq	%edx, %rdx
	salq	$3, %rdx
	leaq	-8(%rdx), %rcx
	movq	-56(%rbp), %rdx
	addq	%rcx, %rdx
	movq	%rdx, (%rax)
	addl	$1, -4(%rbp)
.L2:
	movq	-40(%rbp), %rax
	movl	(%rax), %eax
	cmpl	-4(%rbp), %eax
	jg	.L3
	movl	$.LC3, %edi
	call	puts
	movl	$0, -4(%rbp)
	jmp	.L4
.L5:
	movl	-4(%rbp), %eax
	cltq
	leaq	0(,%rax,8), %rdx
	movq	-16(%rbp), %rax
	addq	%rdx, %rax
	movq	(%rax), %rax
	movq	(%rax), %rax
	movl	-4(%rbp), %edx
	leal	1(%rdx), %ecx
	movq	%rax, %rdx
	movl	%ecx, %esi
	movl	$.LC4, %edi
	movl	$0, %eax
	call	printf
	addl	$1, -4(%rbp)
.L4:
	movq	-40(%rbp), %rax
	movl	(%rax), %eax
	cmpl	-4(%rbp), %eax
	jg	.L5
	movq	-16(%rbp), %rax
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE2:
	.size	get_thispizza, .-get_thispizza
	.ident	"GCC: (GNU) 4.8.5 20150623 (Red Hat 4.8.5-44)"
	.section	.note.GNU-stack,"",@progbits
