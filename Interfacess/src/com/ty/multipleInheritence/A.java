package com.ty.multipleInheritence;

public interface A {

	default void test() {
		System.out.println("test of A");
	}
}
