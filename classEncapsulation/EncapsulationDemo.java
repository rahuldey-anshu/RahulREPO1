package classEncapsulation;

class Student 
{
	
	private int roll_no;
	private String name;
	
	public void setValue(int roll , String name)
	{
		this.roll_no = roll;
		this.name= name;
		System.out.println("user is accessing the roll no and name");
	}
	
//	public void setValue(String name)
//	{
//		this.name = name;
//	}
	
	public int getValue()
	{
		return roll_no;
		
	}
	public String getName()
	{
		return name;
	}
}


	public class EncapsulationDemo 
	{
		public static void main(String[] args) 
	
		{
			
			Student s=new Student();
			s.setValue(20,"rahul");
		//	s.setValue("rahul");
			System.out.println("My rollno is: " + s.getValue());
			System.out.println("My name is : " + s.getName());
		
		}

	}
