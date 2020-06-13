//Another way of implementing comparator
//here we careate a new class that implements comparator interface

package comparators_and_comparable;

import java.util.*;

public class Student_List2 {

	public static void main(String[] args) {
		
	List<Student2> s = new ArrayList<>() ;
	
	s.add(new Student2(20 , "Rahul" , 87)) ;
	s.add(new Student2(21 , "Prabir" , 70)) ;
	s.add(new Student2(42 , "Reshmi" , 98)) ;
	s.add(new Student2 (40 , "Rahul" , 78)) ;
	s.add(new Student2(41 , "Prabir" , 71));
	s.add(new Student2(25 , "Anuj" , 45));
	
	Collections.sort(s , new SortByNameThenMarks()) ; //
	
	s.forEach(System.out::println); 
	
	}
}
	
class SortByNameThenMarks implements Comparator<Student2> 
 {

  @Override
  public int compare(Student2 s1, Student2 s2) 
	{
	   if(s1.name.equals(s2.name))
	   {
			return s1.marks - s2.marks ;
	   }
	   else
	   {
		   return s1.name.compareTo(s2.name);
	   }
		   
	}	
}







//Collections.sort(s ,new Comparator<Student1>() {
//
//
//@Override
//  public int compare(Student1 s1, Student1 s2) 
//	{
//	   if(s1.name.equals(s2.name))
//	   {
//			return s1.marks - s2.marks ;
//	   }
//	   else
//	   {
//		   return s1.name.compareTo(s2.name);
//	   }
//	}
//});

	
	

