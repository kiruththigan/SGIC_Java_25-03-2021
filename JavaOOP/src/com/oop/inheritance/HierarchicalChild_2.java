package com.oop.inheritance;

public class HierarchicalChild_2 extends HierarchicalParent{
	public void Hchild_2() {
		System.out.println("this is a HierarchicalChild_2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HierarchicalChild_2 obj=new HierarchicalChild_2();
		obj.Hparent();
		obj.Hchild_2();

	}

}
