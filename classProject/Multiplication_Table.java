package classProject;

import java.util.*;
public class Multiplication_Table
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		int no ;
		System.out.println("Enter the no for which want to multiplication table:");
		no=sc.nextInt();
		int result = 0;
		
		for(int count=1 ;count<= 20 ;count++)
		{
			result = no * count ;
			System.out.println(" " + count + " * " + no + " = " + result);
		}
		
		sc.close();
		
	}

}
