package classEncapsulation;

public class OverLoadDemo {

	public static void main(String[] args) {
		
		
          main(10,20);
          OverLoadDemo  m=new OverLoadDemo ();
           m.main(50.25, 50.25);
	}
	
	public static void main(int a, int b)
	{
		int c= a+b;
	//	System.out.println(c);
		System.out.println("Rahul" + " " + c);
	}
	
	void main(double r, double t)
	{
		double g = r+t;
		//System.out.println(g);
		System.out.println("Rajesh" + " " + g);
	}
	

}
