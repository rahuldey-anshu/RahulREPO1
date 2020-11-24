package sorting_Program;

import java.util.*;
public class Bubble_sort {
	
	static void bubble_sort(int[] arr)
	{
		int temp ;
		for(int i=0 ; i<arr.length ;i++)
		{
			int flag = 0 ;
			for(int j=0 ; j<arr.length-1-i ; j++)
			{
				if(arr[j] > arr[j+1])
				{
					temp = arr[j] ;
					arr[j] = arr[j+1] ;
					arr[j+1] =temp ;
					flag = 1 ;
				}
			}
			if(flag == 0)
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
		int [] arr1 = new int[n] ;
		
		for(int k=0 ; k<n ; k++)
		{
			arr1[k] = sc.nextInt() ;
		}
		bubble_sort(arr1);
	}

}
