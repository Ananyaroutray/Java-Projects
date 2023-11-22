package com.java.cols;

import java.util.ArrayList;
import java.util.List;

public class FilterExample1 {
	
	public static void main(String[] args) {
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1, "Avesh",89877));
		employList.add(new Employ(2, "Lata",89786));
		employList.add(new Employ(3, "Chetan",89877));
		employList.add(new Employ(4, "Subodh",89877));
		employList.add(new Employ(5, "Azhar",89877));
		employList.add(new Employ(6, "Priya",89877));
		
		employList.stream().filter((e) -> e.getBasic() >= 50000)
		.forEach(x -> {
			System.out.println(x);
		});
		System.out.println("Name Start wuth A  ");
		employList.stream().filter((e) -> e.getName()
				.startsWith("A")).forEach(System.out::println);

}
}