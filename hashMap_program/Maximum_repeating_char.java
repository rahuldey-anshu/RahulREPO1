package hashMap_program;
import java.util.*;
public class Maximum_repeating_char {
	
	static int max_count = 0 ;
	
	static char max_rep_char(String str)
	{
		HashMap<Character , Integer> hm = new HashMap<>() ;

		char []arr = str.toCharArray() ;//string will be stored in character array 
		
		for(char ch : arr)
		{
			if(hm.containsKey(ch))
			{
				hm.put(ch, hm.get(ch)+1) ;
			}
			else
			{
				hm.put(ch, 1);
			}
		}
		 char maxchar=' ' ;
		 
		 for(Map.Entry<Character , Integer> me : hm.entrySet())
		 {
			 if(max_count < me.getValue())
			 {
				 max_count = me.getValue() ;
				 maxchar = me.getKey() ;
			 }
		 }
		return maxchar ; 
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the string");
        
        String str = sc.nextLine();
        
        String str1 = str.replaceAll("\\s", ""); // remove space from string
        
        System.out.println(str1);
        
        System.out.println("Maximum repeated character  is :" + max_rep_char(str1) + " , and it is repeated for " + max_count + " times");
        
	}

}
