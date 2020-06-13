package HashSet_Program;


import java.util.*;

public class TreeSet_Program {

	public static void main(String[] args) {
		Set<String> fruits = new TreeSet<>(); 
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Kiwi");
		fruits.add("Guava");
		
		System.out.println(fruits.add("Kiwi"));
		
		System.out.println(fruits); // TreeSet provide proper sorted ordered/sequence of elements.

	}

}
