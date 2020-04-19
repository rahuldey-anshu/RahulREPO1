package classProject;

public class Fibonacci {

	
static int a=0, b=1,c;

	public static void main(String[] args) {

		
		System.out.print(a +" "+b) ;
		
		Fibonacci f = new Fibonacci();
		f.fibo(10);
		
	}
	
	void fibo(int i)
	{
		if(i>=1)
		{
			c=a+b;
			System.out.print(" " +c);
			a=b;
			b=c;
			fibo(i-1);
		}
	}
}