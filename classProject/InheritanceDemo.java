package classProject;

 class InheritanceDemo {

	void A()
	{
		System.out.println("A class method");
	}
 }
	
	 class B extends InheritanceDemo
	{
		void D()
		{
			System.out.println("B class method");
		}
		
		public static void main(String[] args)
		{
			B ob=new B();
			ob.A();
			ob.D();
		}
		
		
		
	}


