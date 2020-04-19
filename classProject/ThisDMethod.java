package classProject;

// this keyword can be used to invoke current class method(implicitly)

public class ThisDMethod 
{
	void display()
	{
		System.out.println("hello");
	}
	void show()
	{
		this.display();        //display(); -> output will be same
	}
	

	public static void main(String[] args) 
	{
		ThisDMethod t=new ThisDMethod();
		//t.display();
		t.show();
		
		

	}

}
