package string_Problems;

import java.util.*;
public class StringDemo {
	public static void main(String[] args) {
		
		String s1 = new String("Rahul");
		String s2 = new String("Rahul");
		
		System.out.println(s1==s2); // o/p -> false[compare the address]
		System.out.println(s1.equals(s2)); // o/p -> true [compare the object value]
		
		String s3 = "RD" ;
		String s4 = "RD";
		
		System.out.println(s3==s4); // o/p -> true
		System.out.println(s3.equals(s4)); // o/p -> true
		
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine() ;
		String a1 = str ;
		String str1 ="" ;
		
		for(int i = str.length()-1; i>=0 ; i--)
		{
			str1 = str1 + str.charAt(i);
		}
		
		System.out.println("Reversed string is :");
		System.out.println(str1);
		
		if(str1.equals(a1))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not palindrome ");
		}
			
		
		
	}

}
