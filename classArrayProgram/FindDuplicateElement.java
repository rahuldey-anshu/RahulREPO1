package classArrayProgram;

// Find the Duplicate element in the array using Hashset class and set Interface

import java.util.*;

public class FindDuplicateElement 
{

	public static void main(String[] args)
	{
		
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the no of element in the array :");
	
	int n = sc.nextInt();
	
	int [] a= new  int[n];
	
	System.out.println("Enter the elements in the array :");
	
	for(int i=0 ; i<a.length ; i++)
	{
		a[i] = sc.nextInt();
		
	}

	
	Set<Integer> s= new HashSet<>();
	
	System.out.print("The Duplicate Elements in the array are  : ");
	
	for(int no : a)        // [ For Each Loop that mostly used in collection ]
	{
		// boolean b= s.add(no);  [Another way also 
		//  if(b == false)				could be done]
		
		if(s.add(no) == false)
		{
			System.out.print(" "+ no + " , ");
		}
	}
	
	}

}
