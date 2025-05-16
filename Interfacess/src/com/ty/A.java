package com.ty;

interface A {

	public static final int a = 10;

	int b = 20;

	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(A.a);

		System.out.println(b);// bcz static will be added to variable by compiler

//		b = 20;///CTE : b has been made final by the compiler
	}
}