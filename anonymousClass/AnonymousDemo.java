package anonymousClass;

class A 
{
	public void display()
	{
		System.out.println("Inside class A");
	}
}

class AnonymousDemo1{
	public void createClass() {
		A a = new A() 
		{
			public void display()
			{
				System.out.println("Inside an Anonymous class");
			}
		};
		a.display();
	}
}

public class AnonymousDemo {

	public static void main(String[] args) {
		
		AnonymousDemo1 ob = new AnonymousDemo1() ;
		ob.createClass() ;
		
//		A ob1 = new A() ;
//		ob1.display();
	}
}
