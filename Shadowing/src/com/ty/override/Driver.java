package com.ty.override;

public class Driver {

	public static void main(String[] args) {
		B obj = new B();
		obj.test();

		A obj1 = obj;
		obj1.test();

	}
}
