package com.oop.abstraction;

public class BankB extends Bank{
	int depositeBalance=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankB B=new BankB();
		B.deposite(100);
		B.getBalance();
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
