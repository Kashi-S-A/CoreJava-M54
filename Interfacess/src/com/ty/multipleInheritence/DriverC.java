package com.ty.multipleInheritence;

public class DriverC {

	public static void main(String[] args) {
		B obj = new C();//upcasting C to B
		System.out.println(obj.b);
		
		A obj1 = (A) obj;// B to A
		System.out.println(obj1.a);
		
		B obj2 = (B) obj1;// A to B
		System.out.println(obj2.b);
		
		System.out.println("==========================");
		
		A ob = new C();// C --> A
		
		B ob1 = (B) ob ;// A --> B
		System.out.println(ob1.b);
		
		A ob2 = (A) ob1;// B -- A
		System.out.println(ob2.a);
	}
}
