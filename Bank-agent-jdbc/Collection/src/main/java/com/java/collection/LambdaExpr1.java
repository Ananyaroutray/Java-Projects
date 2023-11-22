package com.java.collection;

public class LambdaExpr1 {
	public static void main(String[] args) {
		Hello obj1 = ()-> {
			System.out.println("Hi I am Ananya");
			
		};
		obj1.show();
		Hello obj2 = ()-> {
			System.out.println("Hi I am Khafia");
		};
		obj2.show();
		Hello obj3 = ()-> {
			System.out.println("Hi I am Pramita");
		};
		obj3.show();
	}

}
