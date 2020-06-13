package recursion_Problem;

public class Power_problem {

	static int stepcount=0;
	static int stepcount1=0;
	
	public static void main(String[] args) {
		
	System.out.println(pow(5 , 10));
		System.out.println("Steps count : " + stepcount);
		
		
		System.out.println(fastpow(5,10));
		System.out.println("Steps count : " + stepcount1);
	}

	static int pow(int a , int b)
	{
		System.out.println(b);
		stepcount++;
		
		if(b==0)
		{
			return 1 ;
		}
		return a * pow(a,b-1);
	}
	
	
	//or faster method
	
	static int fastpow(int a , int b)
	{
		System.out.println(b);
		stepcount1++;
		
		if(b == 0)
		{
			return 1;
		}
		if(b%2 == 0)
		{

			return fastpow(a*a , b/2);
		}	
			return a * fastpow(a,b-1);
	}
		
	}
