package com.ty.p1;

public class Test {

	public static void main(String[] args) {
		Calculator calci = new CalculatorImp();//upcasting
		
		calci.calculate(10, 20);
	}
}
