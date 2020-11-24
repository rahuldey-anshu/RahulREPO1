package string_Problems;

import java.util.*;
public class Words_Reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in) ;
		System.out.println("Enter the original String");
		
		String str = sc.nextLine() ;
		System.out.println("Given string is:" + str);
		
		String[] strArray = str.split(" ") ;

		System.out.println(strArray.length);
		
		for(int i=0 ; i<strArray.length ; i++)
		{
			char[] s1 = strArray[i].toCharArray() ;
			for(int j=s1.length-1 ; j>=0 ; j--)
			{
				System.out.print( s1[j]);
			}
		}sc.close();

	}

}
