package com.ty;

import java.util.Scanner;

public class ReadData {

	public static void main(String[] args) {
		System.out.println("main start");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter int value");
		int a = sc.nextInt();
		System.out.println("a : "+a);
		
		System.out.println("Read double value");
		double b = sc.nextDouble();
		System.out.println("b : "+b);
	
		//methods to read all type of data
		sc.nextByte();
		sc.nextShort();
		sc.nextLong();
		sc.nextFloat();
		sc.nextBoolean();
		
		System.out.println("main end");
	}
}
