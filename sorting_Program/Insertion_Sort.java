package sorting_Program;

import java.util.Scanner;

public class Insertion_Sort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements in the array :");
		int n = sc.nextInt();
		
		int [] arr = new int[n];
		int temp , j ;
		
		System.out.println("Enter the  elements in the array ");
		
		for(int i = 0 ; i< n ;i++)
		{
			arr[i] = sc.nextInt();
		}
	
		for(int i=1 ; i<arr.length ; i++)
			
		{
			temp = arr[i];
			j=i ;
			while(j>0 && arr[j-1] > temp)
			{
				arr[j] = arr[j-1] ;
				j=j-1 ;
			}
			arr[j] = temp ;
			
		}
		for(int i=0 ; i<arr.length ; i++)
		{
			System.out.print(arr[i] + " " );
		}
	}

}
