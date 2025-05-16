package com.ty.multipleInheritence;

public class C implements A,B{

	@Override
	public void test() {
		System.out.println("test from C");
		A.super.test();
		B.super.test();
	}

}
