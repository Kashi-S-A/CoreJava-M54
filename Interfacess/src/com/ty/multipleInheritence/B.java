package com.ty.multipleInheritence;

public interface B {

	default void test() {
		System.out.println("test of B");
	}
}
