package comparators_and_comparable;

public class Student2 {
	
	 int roll;
	 String name;
	 int marks ;
	
	public Student2(int r , String n , int m )
	{
		this.roll = r;
		this.name = n;
		this.marks = m ;
		
	}
	
	public int getroll()
	{
		return roll ;
	}
	
	public void setroll(int roll)
	{
		this.roll = roll ;
	}
	public String getname()
	{
		return name ;
	}
	
	public void setname(String name)
	{
		this.name = name ;
	}
	public int getmarks()
	{
		return marks ;
	}
	
	public void setmarks(int marks)
	{
		this.marks = marks ;
	}

	@Override
	public String toString() {
		return "Student2 [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
	
}

