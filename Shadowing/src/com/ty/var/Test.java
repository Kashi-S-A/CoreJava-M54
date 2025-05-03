package com.ty.var;

public class Test {

	public static void main(String[] args) {
		System.out.println(B.i);//20

		B obj = new B();
		System.out.println(obj.j);//40
		
		A obj1 = obj;
		System.out.println(obj1.j);//30
	}
}
