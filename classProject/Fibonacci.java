package classProject;

import java.util.Scanner;

public class Fibonacci {
	
static int a=0, b=1,c;

	void fibo(int n)
	{		
		if(n>2)
		{
			c=a+b;
			System.out.print(" " +c);
			a=b;
			b=c;
			fibo(n-1);
		}
	}
	public static void main(String[] args) {	
		
		Fibonacci f = new Fibonacci();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		
		int n = sc.nextInt();
		System.out.print(a +" "+b) ;
		f.fibo(n);
		
	}
	
}