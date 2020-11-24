package string_Problems;
import java.util.*;
public class Delete_substring {

	static String delete_substring(String str, String substring)
	{
		if(str.contains(substring))
		{
			String temp = substring + " " ;
			str = str.replaceAll(temp,"") ;
			
			temp = " " + substring ;
			str = str.replaceAll(temp, "");
		}
		return str ;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the String");
		
		String str1 = sc.nextLine() ;
		

		System.out.println("Enter the Sub-string, that should be removed");
		String str2 = sc.nextLine() ;
		
		 System.out.println(delete_substring(str1 , str2)) ;
		
		
		
	}
}
