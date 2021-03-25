package com.oop.inheritance;

public class SingleChild extends SingleParent{
	public void child() {
		System.out.println("this is a child");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleChild obj=new SingleChild();
		obj.parent();
		obj.child();
	}

}
