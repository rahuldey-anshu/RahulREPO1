package abstractclass_Interface_Program;
 class Superclass{
	int a = 10;
	public void count() {
		System.out.println("this is the count() of superclass");
	}
}
 class Subclass extends Superclass{
	 int b= 20;
	 public void display() {
		 System.out.println("this is the display of Subclass");
	 }
 }
public class Test2 
{
	public static void main(String[] args) 
	{
//		Subclass ref1 = new Subclass();
		
		Superclass ref2 = new Subclass();
		Subclass ref3 = (Subclass)ref2;	// downcasting  
		ref3.count();
		ref3.display();
		System.out.println(ref3.b);
		System.out.println(ref3.a);
		
		
	}

}
