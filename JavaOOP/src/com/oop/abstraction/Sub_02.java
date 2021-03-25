package com.oop.abstraction;

public class Sub_02 extends Parent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub_02 message=new Sub_02();
		message.printMessage();
	}

	@Override
	public void printMessage() {
		// TODO Auto-generated method stub
		System.out.println("This is second subclass");
	}

}
