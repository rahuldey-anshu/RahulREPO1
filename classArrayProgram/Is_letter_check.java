package classArrayProgram;
import java.util.*;
public class Is_letter_check {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the String");
		String s = sc.nextLine() ;
		int length = 0 ;
		for(char c : s.toCharArray())
		{
			length++ ;
		}
		int len = length ;
		System.out.println("Length of the String is :" +len);
		
		//char[] arr = s.toCharArray() ;
		System.out.println("enter input");
		boolean num1 = true ;
		for(int i=0 ; i<s.length() ; i++)
		{
		
			try {
			//	int num = Integer.parseInt(s) ;
				Double num2 = Double.parseDouble(s) ;
			}
			catch(NumberFormatException e) 
			{
				num1 = false ;
				
			}
		}
		if(num1)
		{
			System.out.println("String is numeric");
		}
		else
		{
			System.out.println("String is not numeric, it has character");
		}
	
	}

}
