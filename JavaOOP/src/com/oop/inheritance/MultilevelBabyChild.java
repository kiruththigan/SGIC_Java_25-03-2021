package com.oop.inheritance;

public class MultilevelBabyChild extends MultilevelChild {
	public void babyChild() {
		System.out.println("this is a multi babyChild");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultilevelBabyChild obj=new MultilevelBabyChild();
		obj.parent();
		obj.child();
		obj.babyChild();
	}

}
