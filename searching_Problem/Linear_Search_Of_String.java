package searching_Problem;

import java.util.*;

public class Linear_Search_Of_String {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in) ;
		
		System.out.println("Enter the no of names");
		
		int n= sc.nextInt();
		
		String [] a  = new String [n+1] ;
		
		System.out.println("Enter the Names in the array:");
		
		for(int i=0 ;i<n+1 ;i++)
		{
			a[i] = sc.nextLine() ;
		}
		
		System.out.println("Enter the name you want to search");
		
		String item = sc.nextLine();
		int temp = 0 ;
		
		for(int i =0 ; i<a.length ;i++)
		{
			if(a[i].equals(item))
			{
				System.out.println("searching name " + item+ " found at index no :" + (i-1));
				temp++ ;
				//System.out.println(temp);
			}
		}
		if(temp == 0)
		{
			System.out.println("Name not found in the array");
		}
		
	}

	}

