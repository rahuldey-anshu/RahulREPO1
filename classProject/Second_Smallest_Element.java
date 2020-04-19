package classProject;

import java.util.Scanner;

public class Second_Smallest_Element {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n ,i,j;
		System.out.println("Enter the no of limit :");
		n=sc.nextInt();
	
		System.out.println("Enter the no of element in the array");
		int [] arr = new int[n];
		
		for(i=0;i<n ;i++)
		{
			arr[i] = sc.nextInt();
	
		}
		int temp = 0;
		for(i=0 ;i<n ; i++)
		{
			for(j=i+1 ; j<n ; j++)
			{
				if(arr[i] > arr[j])
					
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("sorted array is:" );
		for(i=0;i<n ;i++)
		{
		System.out.print( " " + arr[i]);
		}
		System.out.println();
		System.out.println("Secoend Smallest element in the array is:" + arr[1]); 
	}
	

}
