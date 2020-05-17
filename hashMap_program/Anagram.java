package hashMap_program;
import java.util.*;
public class Anagram {
	public static List<List<String>> anagram(String[] strgs){
		Map<String , List<String>> map = new HashMap<>();
		for(String s : strgs)
		{
			char charArr[] = s.toCharArray() ; //convert a string to an array
			Arrays.sort(charArr);
			
			String sorted = new String(charArr); // comparator, used to convert an array to string
			
			if(!map.containsKey(sorted))
			{
				map.put(sorted , new LinkedList<String>());
			}
			map.get(sorted).add(s);
		}
		return  new LinkedList<>(map.values());
	}
	
	public static void main(String[] args) {
	String Array [] = {"tea" , "ate" , "eat" , "bat" , "tab" ,"atb" } ;
 anagram(Array);
 for(int i=0 ;i<Array.length ;i++)
 {
System.out.println(Array);
	}
	}
}
