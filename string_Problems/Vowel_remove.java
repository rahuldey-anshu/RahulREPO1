package string_Problems;
import java.util.*;
public class Vowel_remove {
	
	public static String vowel_remove(String str)
	{
		String s = new String() ;
		s =str.replaceAll("[aeiouAEIOU]", "") ;
		
		return s ;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the String");
		String str1 = sc.nextLine();
		
		System.out.println(vowel_remove(str1));
	}

}
