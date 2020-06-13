package anonymousClass;

 interface Polygon1 {
	
public void display();

}

class Anonoymous_demo{
	public void demo()
	{
		Polygon1 p = new Polygon1() 
		{
			
			public void display()
			{
				System.out.println("Inside an Anonymous class");
			}
		};
		p.display();
	}
}
public class Polygon{
	public static void main(String[] args) {
		
		Anonoymous_demo ad = new Anonoymous_demo();
		ad.demo() ;
	}
}
