package comparators_and_comparable;
//sort using anonymous comparator class 
import java.util.*;

public class Student_List1 {

	public static void main(String[] args) {
		
	
	List<Student1> s = new ArrayList<>() ;
	
	s.add(new Student1(20 , "Rahul" , 87)) ;
	s.add(new Student1(21 , "Prabir" , 70)) ;
	s.add(new Student1(42 , "Reshmi" , 98)) ;
	s.add(new Student1 (40 , "Rahul" , 78)) ;
	s.add(new Student1(41 , "Prabir" , 71));
	s.add(new Student1(25 , "Anuj" , 45));
	
	
	Collections.sort(s ,new Comparator<Student1>() { 
		// A nested class that doesn't have any name is known as an anonymous class.
		
		@Override
		  public int compare(Student1 s1, Student1 s2) 
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
	});
	
	s.forEach(System.out::println); 
	
	}
}
	

//class SortByNameThenMarks implements Comparator<Student1>
// {
//
//  @Override
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
//		   
//	}
//		
//}
	
	
	
