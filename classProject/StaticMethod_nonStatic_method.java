package classProject;

public class StaticMethod_nonStatic_method {
	
	static int a = 20 ;
	
	static void display()
	{
		System.out.println("outside method a is: "+a);	
		a=16; 
		System.out.println("Static method A is "+a); 
	}
	
	void display1()
	{
		a=17 ;
		System.out.println("outside method a is: "+a);	
	}
	
	public static void main(String[] args) {
		
		display();
		StaticMethod_nonStatic_method d  =  new StaticMethod_nonStatic_method() ;
		d.display1();
	}

}
