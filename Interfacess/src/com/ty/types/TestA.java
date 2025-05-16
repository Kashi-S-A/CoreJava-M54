package com.ty.types;

public class TestA {

	public static void main(String[] args) {
		Calci calci = (int a, int b) -> {
			return a + b;
		};

		System.out.println("====================");

		int result = calci.calculate(10, 20);

		System.out.println(result);
	}
}
