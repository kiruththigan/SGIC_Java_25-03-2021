package com.oop.abstraction;

public class BankC extends Bank{
	int depositeBalance=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankC C=new BankC();
		C.deposite(100);
		C.getBalance();
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
