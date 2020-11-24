package string_Problems;
import java.util.* ;
public class Palindrome_string_check {
	
	static String rev="" ;
	static String palindrome_check(String str)
	{
		for(int i=str.length()-1 ; i>=0 ; i--)
		{
			rev = rev + str.charAt(i) ;
		}
		
		return rev ;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str1 = sc.nextLine() ;
		System.out.println("reverse string is:" + palindrome_check(str1));
		if(rev.equals(str1))
		{
			System.out.println("It is a palindrome string");
		}
		else
			System.out.println("It is not a palindrome string");
		
	}

}
