package com.java.collection;

import java.util.ArrayList;
import java.util.List;

public class MaxMin {
	public static void main(String[] args) {
	List<Employ> employList = new ArrayList<Employ>();
	employList.add(new Employ(1,"Ananya",48765));
	employList.add(new Employ(2,"Khafia",88865));
	employList.add(new Employ(3,"Pramita",48365));
	employList.add(new Employ(4,"Akanskha",38765));
	employList.add(new Employ(5,"Sonali",48755));
	employList.add(new Employ(6,"Tanya",42765));
	
	Employ employMax = employList.stream().max((m1,m2) ->
	m1.getBasic() > m2.getBasic() ? 1 : -1).get();
	System.out.println("Employ with max. basic ");
	System.out.println(employMax);
	System.out.println("Employ with min. basic ");
	Employ employMin = employList.stream().min((m1,m2) -> m1.getBasic() > m2.getBasic() ? 1 :-1).get();
	System.out.println(employMin);
}
}