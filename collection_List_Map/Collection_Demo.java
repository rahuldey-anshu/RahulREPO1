package collection_List_Map;

import java.util.Collection;
import java.util.*;


//Dynamic array

public class Collection_Demo 
{

	public static void main(String[] args)
	
	{

	//	Collection values= new ArrayList(); //without generics
		
		Collection<Integer> values= new ArrayList<>(); //using generics {values will be only integer}
		
		
	//	values.add("Rahul");
	//	values.add(5.8f);
		values.add(38);
		values.add(3);
		values.add(20);

		
		//	values.add(1,9); // we can not input value in between the index or in a particular index using collection 
		
		values.remove(3);   //we can remove the value from in_between
		
		//  Collection.sort(values); -> mthod shorts only take list, we can not perform sort operation
		
//----------------------------------------------------------------
	// use iterator to fetch the value
		//(It is an old technique)
//		Iterator i = values.iterator();
//		System.out.println(i.next());
//		System.out.println(i.next());
//		System.out.println(i.next());
//		System.out.println(i.next());
//----------------------------------------------------------------
		// for each loop(Mostly use in collection
		
	//	for(Object i : values)  // when we do not use generic then use Object
		for(int i : values)
		{
			System.out.println(i);
		}
	}
		
	}
