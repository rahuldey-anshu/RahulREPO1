package comparators_and_comparable;

import java.util.*;

public class Runner1 {

		public static void main(String[] args) {
			
			List<Laptop1> list = new ArrayList<>();
			
			list.add(new Laptop1("HP" ,4 , 30000  )) ;
			list.add(new Laptop1("Dell" , 8 , 45700)) ;
			list.add(new Laptop1("Apple_MacBook" , 16 , 150000)) ;
			list.add(new Laptop1("Lenovo" , 2 , 50000)) ;
			list.add(new Laptop1("Samsung" , 10 , 100000)) ;
			list.add(new Laptop1("Acer" , 5 , 27000)) ;
			list.add(new Laptop1("iball" ,4 , 30000  )) ;
			list.add(new Laptop1("Acer" , 3 , 27500)) ;
		
		//1st way of sorting(most efficient)
		Collections.sort(list , Comparator.comparing(Laptop1::getbrand).thenComparing(Laptop1::getprice));
//-------------------------------------------------------------------------------------------------------------------	
		//reversed way of sorting
		//	Collections.sort(list , Comparator.comparing(Laptop1::getbrand).thenComparing(Laptop1::getprice).reversed());
//---------------------------------------------------------------------------------------------------------------------			
		//2nd way of sorting
		//	Collections.sort(list ,(lap1 , lap2) -> lap1.brand.compareTo(lap2.brand)) ; //Lambda expression
//-----------------------------------------------------------------------------------------------------------------------
			
			//3rd way of sorting
		
//			Collections.sort(list ,(lap1 , lap2) -> {   //Lambda expression
//
//					 if(lap1.brand.equals(lap2.brand))
//					   {
//							return lap1.ram - lap2.ram ;
//					   }
//					   else
//					   {
//						   return lap1.brand.compareTo(lap2.brand);
//					   }
//			});
			
//--------------------------------------------------------------------------------------------------------------------			
			
			
		//4th way of sorting
			
//			Collections.sort(list , new Comparator<Laptop1>() 
//			{
//				public int compare(Laptop1 lap1 , Laptop1 lap2)
//				{
//					 if(lap1.brand.equals(lap2.brand))
//					   {
//							return lap1.ram - lap2.ram ;
//					   }
//					   else
//					   {
//						   return lap1.brand.compareTo(lap2.brand);
//					   }
//				}
//			});
//-------------------------------------------------------------------------------------------------------			
			list.forEach(System.out::println);  //this is called Lambda Expression to print the elements
			
//			for(Laptop l: list)
//			{
//				System.out.println(l);
//			}
		
		}
	}

