package com.ty.meth;

public class Test {

	public static void main(String[] args) {
		System.out.println("Driver method");
		A.demo();
		B.demo();
		
		System.out.println("==================");
		
		B obj = new B();
		obj.demo();
		
		A obj1 = obj;
		obj1.demo();
	}
}
