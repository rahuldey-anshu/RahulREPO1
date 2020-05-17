package HashSet_Program;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Duplicate_Word_In_String {
	
	public static Set<String> duplicateWords(String str)
	{
		if(str == null || str.isEmpty()) 
		{
			return Collections.emptySet() ;
		}
		Set<String> duplicates = new HashSet<>() ;
		
		String[] words = str.split("\\ s+") ;
		
		Set<String> s = new HashSet<>();
		
		for(String word : words) 
		{
			if(!s.add(word))
			{
				duplicates.add(word);
			}
		}
		return duplicates ;
	}
	
	public static void main(String[] args) {
		String s1 = "Rahul Dey Rahul Roy " ;
		Set<String> duplicates = duplicateWords(s1) ;
		System.out.println("input : " + s1);
		System.out.println("output :" + duplicates);
	}

}
