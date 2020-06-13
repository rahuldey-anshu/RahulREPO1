package classArrayProgram;

import java.util.Scanner;

public class Array_Delete {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of element");
		int n = sc.nextInt();
		
		char []arr = new char[n] ;
		
		System.out.println("Enter the element in the array");
		for(int i=0 ;i<n ;i++)
		{
			arr = sc.next().toCharArray();
		}
		System.out.println("Array is: ");
		for(int i=0 ;i<arr.length ;i++)
		{
			System.out.print(" " + arr[i] + " ");
		}
		
		
	}

}
