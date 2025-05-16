package com.ty;

public class B {

	final int a = 10;

	final int b;

	{
		b = 20;
		// a = 30;//CTE
	}

	public static void main(String[] args) {

		B obj = new B();

		System.out.println(obj.a);
		System.out.println(obj.b);
	}
}
