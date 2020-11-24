package sorting_Program;

import java.util.Scanner;

public class Character__bubble_sort {
	
	public static void bubble_sort(String[] arr)
	{
		String temp ;
		
		for(int i=0 ; i<arr.length ; i++)
		{
			int flag = 0 ;
			for(int j=0 ; j<arr.length-1-i ; j++)
			{
				if(arr[j].compareTo(arr[j+1]) > 0)
				{
					temp = arr[j] ;
					arr[j] = arr[j+1] ;
					arr[j+1] = temp ;
					flag = 1 ;
				}
			}
			if(flag== 0 )
			{
				break ;
			}
		}
		System.out.println("The array is here after bubble sorting");
		for(int i =0 ; i<arr.length ; i++)
		{
			System.out.print(" " + arr[i] + " ");
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the no of element in the array ");
		int n=sc.nextInt() ;
		System.out.println("Enter the element in the array ");
		String [] arr1 = new String[n] ;
		
		for(int k=0 ; k<n ; k++)
		{
			arr1[k] = sc.nextLine() ;
		}
	
		bubble_sort(arr1);
	}

}
