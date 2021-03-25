package com.oop.abstraction;

public class Dogs extends Animals{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dogs obj=new Dogs();
		obj.dogs();
	}

	@Override
	public void dogs() {
		// TODO Auto-generated method stub
		System.out.println("Dogs bark");
	}

	@Override
	public void cats() {
		// TODO Auto-generated method stub
		
	}

}
