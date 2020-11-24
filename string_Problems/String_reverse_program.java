package string_Problems;
import java.util.*;
public class String_reverse_program {
	
	static String string_rev ="" ;
	
	static String string_rev(String str)
	{
		for (int i=str.length()-1 ; i>=0 ; i--)
		{
			string_rev = string_rev + str.charAt(i) ;
		}
		return string_rev ;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		
		String str = sc.nextLine();
		
		System.out.println("Reverse string is:" + string_rev(str));
		
	}

}
