package com.java.cols;

import java.util.ArrayList;
import java.util.List;

public class MaxMin {
	
	public static void main(String[] args) {
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1, "Avesh",89877));
		employList.add(new Employ(2, "Lata",89786));
		employList.add(new Employ(3, "Chetan",89877));
		employList.add(new Employ(4, "Subodh",89877));
		employList.add(new Employ(5, "Azhar",89877));
		employList.add(new Employ(6, "Priya",89877));
		
		Employ employMax = employList.stream().max((m1,m2) -> 
		m1.getBasic() > m2.getBasic() ? 1 : -1).get();
		System.out.println("employ with Max. basic ");
		System.out.println(employMax);
		System.out.println("employ with min.basic ");
		Employ employMin = employList.stream().min((m1, m2) -> m1.getBasic() > m2.getBasic() ? 1 : -1).get();
		System.out.println(employMin);

}
}
