package classProject;

import java.util.Scanner;

public class Harshad_no {
	
	static void harshad_no(int n)
	{
		int rem , temp  , sum = 0 ;
		
		temp = n ;
		while(temp != 0)
		{
			rem = temp % 10 ;
			sum = sum + rem ;
			temp = temp/10 ;
		}
		int result = n % sum;
		if(result == 0)
		{
			System.out.println( " is a  harshad no");
		}
		else
			System.out.println(n+ " is not a harshad no ");
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no: ");
		int no = sc.nextInt() ;
		harshad_no(no);
	}

}
