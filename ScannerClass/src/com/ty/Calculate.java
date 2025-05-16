package com.ty;

import java.util.Scanner;

public class Calculate {

	public static void main(String[] args) {
		System.out.println("main start");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter first value");
		int a = sc.nextInt();
		
		System.out.println("enter second value");
		int b = sc.nextInt();
		
		add(a, b);
		
		System.out.println("main end");
	}

	public static void add(int a, int b) {
		System.out.println(a + " + " + b + " = " + (a + b));
	}
}
