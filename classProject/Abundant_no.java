package classProject;

import java.util.Scanner;

public class Abundant_no {
	
	static void abundant_no(int n)
	{
		int sum = 0 ;
		for(int i= 1 ; i< n ; i++)
		{
			if(n % i == 0)
			{
				
				sum = sum + i ;
			}
		}
		System.out.println(sum);
		if(sum > n)
		{
			System.out.println("It is a abundant no");
		}
		else
			System.out.println("it is not an abundant no");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no: ");
		int no = sc.nextInt() ;
		abundant_no(no) ;
	}

}
