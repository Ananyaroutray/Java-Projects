package com.java.collection;

import java.util.Optional;

public class OptionalExample1 {
	public static void main(String[] args) {
		String[] str = new String[10];
		str[0]="Rahul";
		str[1]="Sourav";
		str[2]="Khafia";
		str[3]="Pramita";
		str[4]="Ananya";
		str[5]="Shailendra";
		str[6]="Dark Chocolate";
		str[7]="Ganesh";
		str[8]="Sonali";
		
		Optional<String> result = Optional.ofNullable(str[9]);
		if(result.isPresent()) {
			System.out.println(str[8]);
		}
		else {
			System.out.println("Value is not Available");
		}
	}

}
