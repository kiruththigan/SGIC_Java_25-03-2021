package com.oop.abstraction;

public class BankA extends Bank{
	int depositeBalance=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankA A=new BankA();
		A.deposite(100);
		A.getBalance();
	}

	@Override
	public void getBalance() {
		// TODO Auto-generated method stub
		System.out.println("your balance is "+depositeBalance);
	}
	
	public void deposite(int deposite) {
		depositeBalance=deposite;
	}

}
