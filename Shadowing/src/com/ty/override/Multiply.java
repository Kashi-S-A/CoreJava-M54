package com.ty.override;

public class Multiply extends Calculator{

	public void calculate(int a, int b) {
		System.out.println("Multiplication : "+a+" * "+b+" = "+(a*b));
	}
}
