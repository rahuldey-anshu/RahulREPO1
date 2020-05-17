package comparators_and_comparable;

import java.util.* ;
public class Student_List  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> students = new ArrayList<>() ;
		
		students.add(new Student(23 , "Rahul")) ;
		students.add(new Student(24 , "Babu")) ;
		students.add(new Student(35 , "Anuj")) ;
		students.add(new Student(30 , "Rohon")) ;
		students.add(new Student(40 , "Hitesh")) ;
		students.add(new Student(24 , "Anshu"));
		students.add(new Student(40 , "Gitesh")) ;
		
		Collections.sort(students);
		
		students.forEach(System.out::println);  // lambda expression
		
	}

}
