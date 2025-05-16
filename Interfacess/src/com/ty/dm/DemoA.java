package com.ty.dm;

public class DemoA implements A {

	@Override
	public void greet() {
		System.out.println("greet() From DemoA");
	}

	@Override
	public void hi() {
		System.out.println("hi() from DemoA");
	}
}
