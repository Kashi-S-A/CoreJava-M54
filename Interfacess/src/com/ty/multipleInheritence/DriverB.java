package com.ty.multipleInheritence;

public class DriverB {

	public static void main(String[] args) {
		A obj = new C();// upcasting C to A
		System.out.println(obj.a);

		C obj1 = (C) obj;
		System.out.println(obj1.c);
		System.out.println(obj1.a);
	}
}
