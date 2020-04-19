

// Find Duplicate element using BRUTE FORCE METHOD

package classArrayProgram;


import java.util.*;

public class DeleteDuplicateElement 

{
	
	public static void main(String[] args) 
	
	{
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter the no of elenent in the array :" ) ;
	
		int n = sc.nextInt();
		int i;
	
	
		int [] arr=new int[n];
		
		System.out.println("Enter the element in the array");
		
		for(i=0 ; i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Duplicates elements are : ");
		for(i=0 ; i<arr.length; i++)
		{
			for(int j=i+1 ; j<arr.length ; j++)
			{
				if((arr[i] == arr[j]) && (i!=j))
				{
					System.out.print(" " + arr[j] + ",");
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
