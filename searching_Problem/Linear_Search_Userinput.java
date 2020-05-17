package searching_Problem;

import java.util.*;

public class Linear_Search_Userinput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		
		System.out.println("Enter the no of elements");
		
		int n= sc.nextInt();
		
		int a[] = new int[n] ;
		
		System.out.println("Enter the elements in the array");
		
		for(int i=0 ;i<a.length ;i++)
		{
			a[i] = sc.nextInt() ;
		}
		System.out.println("Enter the element you want to search");
		int item = sc.nextInt();
		int temp = 0 ;
		
		for(int i =0 ; i<a.length ;i++)
		{
			if(a[i] == item)
			{
				System.out.println("searching element " + item+ " found at index no :" + i);
				temp++ ;
				System.out.println(temp);
			}
		}
		if(temp == 0)
		{
			System.out.println("Element not found in the array");
		}
		
	}

}
