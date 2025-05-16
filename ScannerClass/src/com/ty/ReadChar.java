package com.ty;

import java.util.Scanner;

public class ReadChar {

	public static void main(String[] args) {
		System.out.println("main start");

		Scanner sc = null;
		
		System.out.println("read character");
		
		char a = sc.next().charAt(3);//index of string
		
		System.out.println("a : "+a);
		
		System.out.println("main end");
	}
}
