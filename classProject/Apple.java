package classProject;

public class Apple {

	void A()
	{
		System.out.println("A class method");
	}
 }
	
	 class Bus extends Apple
	{
		void showB()
		{
			System.out.println("B class method");
		}
	}
	class Cab extends Bus
	{
		
		void C()
		{
			System.out.println("C class method");
		}
		public static void main(String[] args) {
			
			Cab ob=new Cab();
			ob.A();
			ob.showB();
			ob.C();
		}
		
	}