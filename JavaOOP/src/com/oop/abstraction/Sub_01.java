package com.oop.abstraction;

public class Sub_01 extends Parent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub_01 message=new Sub_01();
		message.printMessage();
	}

	@Override
	public void printMessage() {
		// TODO Auto-generated method stub
		System.out.println("This is first subclass");
	}

}
