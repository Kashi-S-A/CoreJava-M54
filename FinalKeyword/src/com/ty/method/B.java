package com.ty.method;

public class B extends A {

	public void demo() {
		System.out.println("demo of B");
		test();//CTS final method can be inherited
	}
	
	public final void test() {//CTE final method cannot be overridden
		System.out.println("test of B");
	}
}
