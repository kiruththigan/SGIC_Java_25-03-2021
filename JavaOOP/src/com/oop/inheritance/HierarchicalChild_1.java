package com.oop.inheritance;

public class HierarchicalChild_1 extends HierarchicalParent{
	public void Hchild_1() {
		System.out.println("this is a HierarchicalChild_1");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HierarchicalChild_1 obj=new HierarchicalChild_1();
		obj.Hparent();
		obj.Hchild_1();
	}

}
