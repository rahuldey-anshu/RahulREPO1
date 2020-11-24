package string_Problems;
import java.util.*;
public class Remove_letters {
	
	static void removechar(String s , char c)
	{
		int i=0 , j = 0 , count= 0;
		char[] str = s.toCharArray() ;
		for(i=0 ; i<s.length() ; i++)
		{
			if(str[i]!= c)
			{
				str[j++] = str[i] ;
			}
			else
				count++ ;
		}
		
		while(count > 0)
		{
			str[j++] = '\0' ;
			count-- ;
		}
		System.out.println(str);
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the original string");
		String string1 = sc.nextLine() ;
		
		System.out.println("Enter the letter, you want to remove");
		String string2 = sc.nextLine() ;
		
		char l = string2.charAt(0) ;
		
		removechar(string1 , l);
		sc.close();
 		
	}

}
