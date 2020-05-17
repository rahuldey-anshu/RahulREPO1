package hashMap_program;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap_Entryset {

		public static void main(String[] args){

			// initialize the HashMap object with Integer as key and String as value
			
			HashMap<Integer, String> mapEmployee = new HashMap<Integer, String>();
			
			// populate the student map
			mapEmployee.put(1287, "Tara Sutaria");
			mapEmployee.put(3125, "Farhan Akhtar");
			mapEmployee.put(9972, "Steve jovs");
			
			//get the keys
			
			Set<Map.Entry<Integer, String>> mappingSet = mapEmployee.entrySet();
			
			System.out.println("Initial value of keys:"+mappingSet);
			
			// add another key value mapping
			mapEmployee.put(4581, "Narendra modiji");
			
			// print the values which the set contains
			System.out.println("New set of keys:"+mappingSet);
		}	
	}
