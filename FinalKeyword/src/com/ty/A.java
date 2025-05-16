package com.ty;

public class A {

	final static int A = 10;

	final static int B;

	final static String NAME = "Dinga";

	static {
		B = 20;
		//A = 20;//CTE
	}

	public static void main(String[] args) {
		System.out.println(A);
		//B = 30 ;//CTE
		System.out.println(B);
		System.out.println(NAME);
	}
}
