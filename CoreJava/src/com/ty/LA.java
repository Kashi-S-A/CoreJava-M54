package com.ty;

public class LA extends Account{
	
	double loan;
	double emi;

	public LA(long accno, String name, double balance,double loan,double emi) {
		super(accno, name, balance);
		this.loan=loan;
		this.emi=emi;
	}
	
	public void display() {
		super.display();
		System.out.println("--------LA---------");
		System.out.println("Loan : "+loan);
		System.out.println("EMI : "+emi);
	}
}
