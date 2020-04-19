package classProject;

//this keyword can use be used to invoke current class constructor

public class This1 
{
	This1()
	{
	//	this(10);
		System.out.println("No argument constructor");
	}
	This1(int a)
	{
		  this();
		System.out.println("Parametrised constructor");
		
	}

	public static void main(String[] args) {
		
		This1 t=new This1();
		

	}

}
