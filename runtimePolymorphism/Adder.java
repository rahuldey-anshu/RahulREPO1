package runtimePolymorphism;

public class Adder {
	
	static int add(int a , int b)
	{
		return a+b ;
	}
	
	static double add(double a , double b)
	{
		return a*b ;
	}
}

class Subadder extends Adder
{
	static int add(int a , int b)
	{
		return a-b ;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Adder a = new Subadder();
		System.out.println(Adder.add(8.7, 8.7)) ;
		System.out.println(a.add(7, 8)) ;
		System.out.println(a.add(15, 4)) ;
		

	}

}
