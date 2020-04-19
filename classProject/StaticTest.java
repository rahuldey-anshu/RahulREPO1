package classProject;


class Student 
{
	String name ;
	int roll ;
	
	static String clg_name; 	 // static data member
	static int counter =0 ;
	
	public Student(String name)
	{
		this.name = name ;
		this.roll = setRoll_no ();
	}
	
	static int setRoll_no()
	{
		counter++;
		return counter ;
	}
	
	static void setclg(String name)
	{
		clg_name = name ;
		
	}
	
	void getStudentInfo()
	{
		System.out.println("Name :" + name);
		System.out.println("Roll no :" + roll);
		System.out.println("college Name :" + clg_name);
	}
}
public class StaticTest 
{
	public static void main(String[] args) {
		
		Student.setclg("Dream Institute Of Technology") ;
		
		Student s1 = new Student("RAHUL DEY");
		Student s2 = new Student("Biswarup Das");
		Student s3 = new Student("Biplab Biswas");
		
		s1.getStudentInfo();
		s2.getStudentInfo();
		s3.getStudentInfo();
	}

}
