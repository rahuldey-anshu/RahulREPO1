package sorting_Program;

import java.util.*;
public class Selection_Sort_String {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of words in the string :");
		int n = sc.nextInt();
		
		String [] str = new String[n+1];
		
		System.out.println("Enter the words in the String ");
		
		for(int i = 0 ; i<= n ;i++)
		{
			str[i] = sc.nextLine();
		}
		int min ;
		String temp = "" ;
		for(int i=0 ; i<str.length ; i++)
		{
			min = i ;
			for(int j=i+1 ; j<str.length ; j++)
			{
				if(str[j].compareTo(str[min])< 0)
				{
					min = j ;
				}
			}
			temp = str[i];
			str[i] = str[min] ;
			str[min] = temp ;
			
		}
		for(int i=0 ; i<str.length ; i++)
		{
			System.out.println(str[i] + "");
		}
	}

}
//ahlru