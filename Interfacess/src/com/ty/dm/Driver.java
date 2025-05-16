package com.ty.dm;

public class Driver {

	public static void main(String[] args) {
		A obj = new TestA();
		obj.greet();
		obj.hi();

		A obj1 = new DemoA();
		obj1.greet();
		obj1.hi();
	}
}
