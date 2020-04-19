package classProject;

// this keyword can be used to pass as an argument in the method call

public class This2 
{
	
	void method1(This2 t)
	{
		System.out.println(" i am in method1");
	}
	
	
	void method2()
	{
		method1(this);
		System.out.println("I am in method 2");
	}
	
	public static void main(String[] args) 
	{
		
		This2 t=new This2();
	//	t.method1();
		t.method2();
		
		
	}

}
