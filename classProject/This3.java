package classProject;

// this keyword can be used to pass an argument in the constructor call

class Test2
{
	Test2(This3 tc)
	{
		System.out.println("Test 2 class constructor");
	}
}

public class This3 
{
	void m()
	{
		Test2 l=new Test2(this);
		
	}
	public static void main(String[] args, This3 l)
		{
		This3 td= new This3();
		l.m();
		
		}
}
	

