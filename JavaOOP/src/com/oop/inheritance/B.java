package com.oop.inheritance;

public class B extends A{
	public void child() {
		System.out.println("this is a child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A objP=new A();
		objP.Parent();
		
		B objC=new B();
		objC.child();
		objC.Parent();

	}

}
