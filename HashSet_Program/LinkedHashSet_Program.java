package HashSet_Program;


import java.util.*;

public class LinkedHashSet_Program {

	public static void main(String[] args) {

		Set<String> fruits = new LinkedHashSet<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Kiwi");
		
		System.out.println(fruits.add("Kiwi"));
		
		System.out.println(fruits); // LinkedHashSet provide proper ordering/sequence of elements.
	
	}

}
