package comparators_and_comparable;

import java.util.*;

public class Runner {

	public static void main(String[] args) {
		
		List<Laptop> list = new ArrayList<>();
		
		list.add(new Laptop("HP" ,4 , 30000  )) ;
		list.add(new Laptop("Dell" , 8 , 45700)) ;
		list.add(new Laptop("Apple_MacBook" , 16 , 150000)) ;
		list.add(new Laptop("Lenovo" , 2 , 50000)) ;
		list.add(new Laptop("Samsung" , 10 , 100000)) ;
		list.add(new Laptop("Acer" , 5 , 27000)) ;
		list.add(new Laptop("iball" ,4 , 30000  )) ;
		
		
		Collections.sort(list);
		
		list.forEach(System.out::println);  //this is called Lambda Expression to print the elements
		
//		for(Laptop l: list)
//		{
//			System.out.println(l);
//		}
	
	}
}
