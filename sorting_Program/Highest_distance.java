package sorting_Program;

import java.util.Scanner;

public class Highest_distance {
	
	static void Highest_distance(double[] arr)
	{
		double temp = 0.0 ;
		for(int i=0 ; i<arr.length ; i++)
		{
			for(int j=1 ; j< arr.length-i ; j++)
			{
				if(arr[j+1] > arr[j])
				{
					temp = arr[j+1];
					arr[j+1] = arr[j] ;
					arr[j] = temp ;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the no of racer : ");
		int n = sc.nextInt() ;
		
		double[] arr = new double[n];
		System.out.println("Enter the value into array");
		for(int i=0 ; i< arr.length ; i++)
		{
			arr[i] = sc.nextDouble();
		}
		
		Highest_distance(arr) ;
		
		
		
		for(int i=0 ; i< arr.length ; i++)
		{
			if(arr[i] == 42.195)
			{
				//System.out.print(" " +arr[i+1]+ arr[i+2] + +arr[i+3]);
				System.out.print(" " +arr[i+1]) ;
			}
		
		
		}
		
		
	}
}

