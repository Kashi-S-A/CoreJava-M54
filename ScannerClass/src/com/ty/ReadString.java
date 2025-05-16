package com.ty;

import java.util.Scanner;

public class ReadString {

	public static void main(String[] args) {
		System.out.println("main start");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("read data using next()");
		String b = sc.next();
		System.out.println("b : "+b);
		
		sc.nextLine();//to consume existing data in input file
		
		System.out.println("read data using nextLine()");
		String a = sc.nextLine();
		System.out.println("a : "+a);
		
		System.out.println("main end");
	}
}
