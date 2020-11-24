package runtimePolymorphism;

public class Base {
	
	private static void display()
	{
		System.out.println("static method from Base class");
	}
	public void print()
	{
		System.out.println("non-static method from Base class");
	}

}

class Derived extends Base{
	private static void display()
	{
		System.out.println("static method from Derived class");
	}
	public void print()
	{
		System.out.println("non-static method from Derived class");
	}
	
	public static void main(String[] args) {
		Base b1 = new Derived() ; //upcasting
		//b1.display();
		b1.print();
		
	}
}
