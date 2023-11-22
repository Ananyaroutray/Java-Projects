package com.java.cols;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmploySort {
	
	public static void main(String[] args) {
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1, "Avesh",89877));
		employList.add(new Employ(2, "Lata",89786));
		employList.add(new Employ(3, "Chetan",89877));
		employList.add(new Employ(4, "Subodh",89877));
		employList.add(new Employ(5, "Azhar",89877));
		employList.add(new Employ(6, "Priya",89877));
		
		System.out.println("Sort  By name-wise ");
		Collections.sort(employList, (e1, e2)-> {
			return e1.getName().compareTo(e2.getName());
			
		});
		employList.forEach(System.out::println);		
		
		Collections.sort(employList, (e1,e2) -> {
			return (int) (e1.getBasic() - e2.getBasic());
		});
		System.out.println("sort by basic ");
		employList.forEach(System.out::println);

	}
}
