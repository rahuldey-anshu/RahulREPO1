package constructor_in_java;

public class Student {

	int id ;
	String name ;
	Student(int id , String name)
	{
		this.id = id ;
		this.name = name ;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s = new Student( 1 , "RAHUL") ;
		Student s1 = new Student( 2 , "RACHU") ;
		
		System.out.println("Student 1 :" + "id :" + s.id + " " +  s.name);
		System.out.println("Student 2 :" + "id :" + s1.id + " " + s1.name);
	}

}
