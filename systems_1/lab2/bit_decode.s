	.file	"bit_decode.c"
	.section	.rodata
.LC0:
	.string	"input code thing : "
	.text
	.globl	create_key
	.type	create_key, @function
create_key:
.LFB0:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$16, %rsp
	movl	$0, -4(%rbp)
	movl	$.LC0, %edi
	movl	$0, %eax
	call	printf
	movl	$0, -8(%rbp)
	jmp	.L2
.L3:
	sall	-4(%rbp)
	call	getchar
	andl	$1, %eax
	orl	%eax, -4(%rbp)
	addl	$1, -8(%rbp)
.L2:
	cmpl	$3, -8(%rbp)
	jle	.L3
	movl	-4(%rbp), %eax
	sall	$4, %eax
	orl	-4(%rbp), %eax
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE0:
	.size	create_key, .-create_key
	.globl	rotate_left
	.type	rotate_left, @function
rotate_left:
.LFB1:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	movl	%edi, -20(%rbp)
	movl	$255, -4(%rbp)
	movl	-20(%rbp), %eax
	addl	%eax, %eax
	andl	-4(%rbp), %eax
	movl	-20(%rbp), %edx
	sarl	$7, %edx
	orl	%edx, %eax
	movl	%eax, -8(%rbp)
	movl	-8(%rbp), %eax
	popq	%rbp
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE1:
	.size	rotate_left, .-rotate_left
	.globl	rotate_right
	.type	rotate_right, @function
rotate_right:
.LFB2:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	movl	%edi, -20(%rbp)
	movl	$255, -4(%rbp)
	movl	-20(%rbp), %eax
	sarl	%eax
	movl	%eax, %edx
	movl	-20(%rbp), %eax
	sall	$7, %eax
	andl	-4(%rbp), %eax
	orl	%edx, %eax
	movl	%eax, -8(%rbp)
	movl	-8(%rbp), %eax
	popq	%rbp
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE2:
	.size	rotate_right, .-rotate_right
	.globl	decrypt
	.type	decrypt, @function
decrypt:
.LFB3:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$32, %rsp
	movl	%edi, -20(%rbp)
	movl	%esi, -24(%rbp)
	movl	%edx, -28(%rbp)
	cmpl	$0, -28(%rbp)
	je	.L10
	movl	-20(%rbp), %eax
	movl	%eax, %edi
	call	rotate_left
	jmp	.L11
.L10:
	movl	-20(%rbp), %eax
	movl	%eax, %edi
	call	rotate_right
.L11:
	movl	%eax, -4(%rbp)
	movl	-24(%rbp), %eax
	xorl	%eax, -4(%rbp)
	movl	-4(%rbp), %eax
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE3:
	.size	decrypt, .-decrypt
	.globl	read_digits
	.type	read_digits, @function
read_digits:
.LFB4:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$16, %rsp
	movl	$0, -4(%rbp)
	movl	$0, -8(%rbp)
	jmp	.L14
.L15:
	sall	-4(%rbp)
	call	getchar
	andl	$1, %eax
	orl	%eax, -4(%rbp)
	addl	$1, -8(%rbp)
.L14:
	cmpl	$3, -8(%rbp)
	jle	.L15
	movl	-4(%rbp), %eax
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE4:
	.size	read_digits, .-read_digits
	.section	.rodata
.LC1:
	.string	"%2x"
	.text
	.globl	read_code
	.type	read_code, @function
read_code:
.LFB5:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$32, %rsp
	movl	%edi, -20(%rbp)
	movl	$0, -4(%rbp)
	jmp	.L18
.L21:
	leaq	-8(%rbp), %rax
	movq	%rax, %rsi
	movl	$.LC1, %edi
	movl	$0, %eax
	call	__isoc99_scanf
	movl	-4(%rbp), %eax
	cltd
	shrl	$31, %edx
	addl	%edx, %eax
	andl	$1, %eax
	subl	%edx, %eax
	movl	%eax, %edx
	movl	-8(%rbp), %eax
	movl	-20(%rbp), %ecx
	movl	%ecx, %esi
	movl	%eax, %edi
	call	decrypt
	movl	%eax, %edi
	call	putchar
	call	getchar
	cmpl	$10, %eax
	jne	.L19
	jmp	.L17
.L19:
	addl	$1, -4(%rbp)
.L18:
	cmpl	$199, -4(%rbp)
	jle	.L21
.L17:
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE5:
	.size	read_code, .-read_code
	.globl	main
	.type	main, @function
main:
.LFB6:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	.cfi_offset 6, -16
	movq	%rsp, %rbp
	.cfi_def_cfa_register 6
	subq	$16, %rsp
	movl	$0, %eax
	call	create_key
	movb	%al, -1(%rbp)
	call	getchar
	movsbl	-1(%rbp), %eax
	movl	%eax, %edi
	call	read_code
	movl	$10, %edi
	call	putchar
	movl	$0, %eax
	leave
	.cfi_def_cfa 7, 8
	ret
	.cfi_endproc
.LFE6:
	.size	main, .-main
	.ident	"GCC: (GNU) 4.8.5 20150623 (Red Hat 4.8.5-44)"
	.section	.note.GNU-stack,"",@progbits
