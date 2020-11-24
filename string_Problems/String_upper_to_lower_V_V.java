package string_Problems;
import java.util.*;
public class String_upper_to_lower_V_V {
	
	static String str_upper_to_lower(String s)
	{
		String s1 = " " ;
		for(int i=0 ; i< s.length() ; i++)
		{
		if(Character.isUpperCase(s.charAt(i)))
		{
			s1 = s1 + Character.toLowerCase(s.charAt(i)) ;
		}
		else
			s1 = s1 + Character.toUpperCase(s.charAt(i)) ;
		}
		
		return s1 ;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the String :");
		String str1 = sc.nextLine() ;
		
		System.out.println("Toggle String is :");
		System.out.println(str_upper_to_lower(str1));
		
		
	}

}
