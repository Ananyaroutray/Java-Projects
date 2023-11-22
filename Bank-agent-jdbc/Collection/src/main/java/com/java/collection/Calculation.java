package com.java.collection;

public class Calculation {
 int sum(int x, int y) {
	 return x+y;
 }
 int mul(int x, int y) {
	 return x*y;
 }
 int sub(int x, int y) {
	 return x-y;
 }
 int div(int x, int y) {
	 return x/y;
 }
 public static void main(String[] args) {
	Calculation obj = new Calculation();
	IMethodRef2 m1 = obj::sum;
	System.out.println("Sum is " +m1.calc(12, 5));
	
	IMethodRef2 m2 = obj::mul;
	System.out.println("Mul is " +m2.calc(12, 5));
	
	IMethodRef2 m3 = obj::sub;
	System.out.println("Sub is " +m3.calc(12, 5));
	
	IMethodRef2 m4 = obj::div;
	System.out.println("Div is " +m4.calc(12, 5));
}
}