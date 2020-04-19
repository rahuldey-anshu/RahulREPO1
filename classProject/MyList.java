package classProject;


import java.util.ArrayList;

import java.util.LinkedList;
import java.util.List;

public class MyList {

	public static void main(String[] args) {
		
		List<String> fruits = new ArrayList<>();
		
		List<String> veg=new LinkedList<>();
		
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Guava");
		
		System.out.println("list of fruits objects: " + fruits);
				
		veg.add("potato");
		veg.add("Onion");
		veg.add("Tomato");
		
		System.out.println(fruits.get(1));  // get() method shows the object's index no value
		System.out.println(fruits);
		
		System.out.println(fruits.set(1 , "Banana"));
		System.out.println(fruits);
		
		System.out.println("list of vej objects: " +veg);
		
		//  fruits.addAll(veg);  //addAll() method add to different list
		//  System.out.println(fruits);
		veg.addAll(fruits);
		System.out.println(veg);
		
	
		System.out.println(fruits.remove(1));
		System.out.println(fruits);
		System.out.println(fruits.size());
		
		System.out.println(fruits.contains("Guava"));
		System.out.println(fruits.contains("onion "));
		
		fruits.add("Banana");
		fruits.add("Mango");
		
		String temp[]  =  new String[fruits.size()];
		
	//	fruits.toArray(temp);
		
	//	System.out.println(fruits.isEmpty());
		
		for(String e: fruits)
		{
			System.out.println(e);
		}
		
		
		
		
		
		
		
	}

}
