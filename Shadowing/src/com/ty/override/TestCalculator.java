package com.ty.override;

public class TestCalculator {

	public static void main(String[] args) {
		
		Calculator c = null;
		
		c = new Calculator();
		c.calculate(10, 30);
		
		c = new Substract();
		c.calculate(30, 10);
		
		c = new Multiply();
		c.calculate(10, 5);
	}
}
