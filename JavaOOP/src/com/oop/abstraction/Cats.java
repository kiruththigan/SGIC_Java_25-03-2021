package com.oop.abstraction;

public class Cats extends Animals{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cats obj=new Cats();
		obj.cats();
	}

	@Override
	public void dogs() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cats() {
		// TODO Auto-generated method stub
		System.out.println("Cats meow");
	}

}
