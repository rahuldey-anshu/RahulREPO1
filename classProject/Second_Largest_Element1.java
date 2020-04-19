package classProject;

import java.util.Scanner;

public class Second_Largest_Element1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n ,i,j;

		int largest = Integer.MIN_VALUE;
		int second_largest = Integer.MIN_VALUE;
		
		System.out.println("Enter the no of limit :");
		n=sc.nextInt();
	
		System.out.println("Enter the no of element in the array");
		int [] arr = new int[n];
		
		for(i=0;i<n ;i++)
		{
			arr[i] = sc.nextInt();
	
		}
	for(i=0;i<n;i++)
	{
		if(arr[i] > largest)
		{
			second_largest = largest;
			largest = arr[i];
		}
		else if(arr[i]> second_largest && arr[i]!= largest)
		{
			second_largest = arr[i];
		}
	}
		if(second_largest == Integer.MIN_VALUE)
		{
			System.out.println("There is no 2nd largest value");
		}
		else
		{
			System.out.println("Second largest element is:" +second_largest);
		}
		System.out.println("largest element is"+ largest);
	
	
	}

}
