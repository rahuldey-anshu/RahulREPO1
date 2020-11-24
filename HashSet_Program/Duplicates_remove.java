package HashSet_Program;

import java.util.*;
public class Duplicates_remove {
	
	static void duplicate_char_remove(String str)
	{
		LinkedHashSet<Character> hs = new LinkedHashSet<>();
		
		for(int i=0 ;i<str.length() ; i++)
		{
			hs.add(str.charAt(i)) ;
		}
		System.out.println("After removing duplicate character from string:");
		for(char ch : hs)
		{
			System.out.print(ch);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		
		String str = sc.nextLine();
		//Duplicates_remove dr = new Duplicates_remove();
		duplicate_char_remove(str);
	}

}
