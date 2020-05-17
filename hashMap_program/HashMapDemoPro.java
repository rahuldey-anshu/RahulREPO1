package hashMap_program;

import java.util.* ;
public class HashMapDemoPro {

	public static void main(String[] args) {
		
		HashMap <String , String> hash = new HashMap<>() ;
		
		hash.put("15209011005" , "Biplab Biswas");
		hash.put("15209011006" , "Biswarup Das");
		hash.put("15209011020" , "Rahul Dey");
		hash.put("15209011009" , "Jayant Mitra");
		hash.put("15209011014" , "Mithun Kumar Mondal");
		hash.put("15209011001" , "Anamika Kumari");
		hash.put("15209011007" , "Anshul Kumar");
		hash.put("15209011003" , "Arunavo Biswas");
	    hash.put("15209011003" , "Mama Biswas"); // we can not create dupliate keys in map "Map doesnot support", 
	    //if we create duplicate keys then the previous value of the particular key will be replaced with the current one.
		
		
		if(! hash.isEmpty()) 
		{
			for(String s: hash.keySet())
			{
				System.out.println("Student name with ID - "+" " + s + " is :"+ " " +   hash.get(s));
			}
		}
		
	}

}
