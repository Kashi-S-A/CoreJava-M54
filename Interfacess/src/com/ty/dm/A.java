package com.ty.dm;

public interface A {

	void greet();
	
	default void hi()
	{
		System.out.println("hi() of A");
	}
}
