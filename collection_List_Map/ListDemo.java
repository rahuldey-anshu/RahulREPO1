package collection_List_Map;

import java.util.*;


public class ListDemo {

	public static void main(String[] args) 
	
	{
		
		// List and collection always maintain the sequence of data insertion
		List<Integer> values = new ArrayList<>();
		
		values.add(3);
		values.add(99);
		values.add(45);
		values.add(85);
		values.add(8);

		Collections.sort(values);  // -> sort the value of arraylist 
	//	System.out.println(values);
		
		
	//	values.forEach(System.out::println);// ->> Stream API .. Lambda Expression // Another way of printing the values of arraylist
		
		
		for(int i : values)
		{
			System.out.println(i);
		}
		
		// values.forEach(int i : values)
		{
			
		}
	}

}
