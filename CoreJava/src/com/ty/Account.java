package com.ty;

public class Account {

	long accno;
	String name;
	double balance;

	public Account(long accno, String name, double balance) {
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}

	public void display() {
		System.out.println("===========Account===========");
		System.out.println("AccNo :" + accno);
		System.out.println("Name : " + name);
		System.out.println("Balance : " + balance);
	}
}
