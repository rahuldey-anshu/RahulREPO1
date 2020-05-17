package hashMap_program;
import java.util.Map.Entry;
import java.util.*;
public class HashMapProApniKaksha {
  public static void main(String[] args) {
	
	  Map<String,Integer> no = new HashMap<>() ;
	  no.put("one" , 1);
	  no.put("Two" , 2);
	  no.put("three" , 3);
	  no.put("four" , 4) ;
//	  no.remove("four");
	  
	  
	  System.out.println(no);
	  System.out.println(no.keySet());
	  System.out.println(no.values());
	  System.out.println(no.entrySet());
	  
	  Set<Entry<String , Integer>> entries = no.entrySet() ;
	  
	  for(Entry<String , Integer> entry : entries)
	  {
		  entry.setValue(entry.getValue() * 100) ;
	  }
	  
	  System.out.println(no);
	  System.out.println(getHash("CAT"));
	  System.out.println(getHash("DOG"));
	  System.out.println(getHash("BALL"));
	  System.out.println(getHash("GOD"));
}
  public static int getHash(String s)
  {
	  int hash = 0;
	  for(int i=0 ; i<s.length(); i++)
	  {
		  hash += s.charAt(i);
	  }
	  return hash ;
  }
}
