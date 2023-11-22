package com.java.collection;

public class RefExample1 {
	void display() {
		System.out.println("Example of Functional interface");
	}
	public static void main(String[] args) {
		RefExample1 obj = new RefExample1();
		IMerhodRef1 m1 = obj::display;
		m1.show();
	}

}
