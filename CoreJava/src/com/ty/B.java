package com.ty;

public class B extends A{

	int z = 200;
	
	public static void main(String[] args) {
		new B().display();
	}
	public void display() {
		int z = 300;
		System.out.println(z);//300
		System.out.println(this.z);//200
		System.out.println(super.z);//100
		super.test();//test of A
	}
}
