package hashMap_program;

import java.util.HashMap;
import java.util.Set;

public class Hash_Map_Set {

	public static void main(String[] args) {
		
		HashMap <String ,String> hash = new HashMap <>();
		  
		  hash.put("Name" , "Rahul");
		  hash.put("Email" , "rd90963@gmail.com");
		  hash.put("Password" , "1234567");
		  hash.put("Address", "WestBengal") ;
		  hash.put("Profession" , "Software Engineer");	
		  
		  System.out.println(hash);
		  
		  
		  
		  
		  Set <String> s = hash.keySet();
		  
		  for(String key : s)
		  {
			  System.out.println(key + " " + hash.get(key));
		  }
		
		
	}

}
