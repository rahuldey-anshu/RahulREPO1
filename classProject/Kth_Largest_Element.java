package classProject;

import java.util.Scanner;

public class Kth_Largest_Element {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n ,i,j;
		int k=2;
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
				if(arr[i] < arr[j])
					
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j] = temp;
				}
			}
			if(i==k-1)
			{
				System.out.println(k +"Largest element is" + arr[i]);
				//break;
			}
		}
		System.out.println("----------------------------------------");
		for(i=0;i<n;i++)
		{
			System.out.print(" " +arr[i]);
		}

	}

}
