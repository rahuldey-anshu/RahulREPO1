package string_Problems;
import java.util.*;
public class Remove_letter_frm_String {

	static String remove_char(String str , char c)
	{
		char[] arr = str.toCharArray() ; //convert string to character-array
		
		int count =0 , j=0 ;
	
		for(int i=0 ; i<str.length() ; i++)
		{
			if(arr[i] != c)
			{	
				arr[j++] = arr[i] ;	
			}
			else
				count++ ;
		}
		while(count > 0)
		{
			arr[j++] = '\0' ;
			
			count -- ;
		}
		String s = new String(arr) ; //Convert char array to string(1st way)
		return s ;
		
//		String str2 = String.valueOf(arr);  //Convert char array to string(2nd way)
//		return str2 ;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		
		String str1 = sc.nextLine() ;
		
		System.out.println("Enter the character , you want to remove");
		
		char c1 = sc.next().charAt(0); // take Character input from user
		
		System.out.println(remove_char(str1 ,  c1));
		
		
	}
}
