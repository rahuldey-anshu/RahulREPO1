package classProject;
import java.util.*;
public class Prime_no {
	
	void prime(int n)
	{
		int temp = 0 ;
		if(n==0 && n==1)
		{
			System.out.println("not consider as a prime no");
		}
		else 
		{
		for(int i=1 ; i<=n ;i++)
		{
			if(n % i == 0)
			{
				temp = temp+1 ;
			}
		}
		}
		if(temp == 2)
		{
			System.out.println(n+ " is prime no");
		}
		else
			System.out.println(n+ " is not prime");
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no");
		int n = sc.nextInt();
		Prime_no  p = new Prime_no ();
		p.prime(n);
	}

}
