package classProject;

import java.util.*;

public class Vowel_replace {
	
	static String vowel_replace(String str)
	{
		char [] arr = str.toCharArray() ;
		
		for(int i=0 ; i< arr.length ; i++)
		{
			if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u'   )
			{
				arr[i] = '%'  ;
			}
		}
		String s = new String(arr);
			return s;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string: ");
		String str1 = sc.nextLine() ;
		System.out.println("New String after replacing the special character % is ");
		System.out.println(vowel_replace(str1));
		
		
	}

}
