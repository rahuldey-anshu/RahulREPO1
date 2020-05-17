package classProject;

import java.util.*;

public class Sum_Of_even__Odd_no {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of element");
		int n = sc.nextInt() ;
		int sum = 0 ;
		int odd_sum = 0 ;
		int [] arr = new int[n] ;
		System.out.println("Enter the elements in the array");
		
		for(int i=0 ; i< n ;i++)
		{
			arr[i] = sc.nextInt() ;
		}
		
		for(int i= 0 ; i< n ;i++)
		{
			if(arr[i]%2 == 0)
			{
				sum = sum + arr[i] ;
			
			}
			
			else
			{
				odd_sum = odd_sum + arr[i] ;
				
			}
		}
		System.out.println("sums of the even nos : " + sum );
		System.out.println("sums of the odd nos : " + odd_sum);
		
	}

}
