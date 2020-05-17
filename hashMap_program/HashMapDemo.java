package hashMap_program;


import java.util.* ;

//import java.util.HashMap ;
//import java.util.Map;


public class HashMapDemo {
	

		public static void main(String[] args) {
			
			 HashMap<String,Integer> h = new HashMap<String , Integer>( ) ;
			 
			  h.put("a1" , 20);
			  h.put("b1" , 30);
			  h.put("c1" , 40) ;
			  h.put("d1", 544);
			  h.put("e1", 784);
			  
			  System.out.println(h);
			  
			  System.out.println("Value of a particular key c1 :" + h.get( "c1" ));
			  System.out.println("Value of a particular key e1 :" + h.get( "e1" ));
			  System.out.println("Value of a particular key d1 :" +h.get( "d1" ));
			  System.out.println("Value of a particular key b1 :" +h.get( "b1" ));
			  System.out.println("Value of a particular key a1 :" +h.get( "a1" ));
			  
 //============================================================================================
			  
			  HashMap <String ,String> hash = new HashMap <>();
			  
			  hash.put("Name" , "Rahul");
			  hash.put("Email" , "rd90963@gmail.com");
			  hash.put("Password" , "1234567");
			  hash.put("Address", "WestBengal") ;
			  hash.put("Profession" , "Software Engineer");	
			  hash.putIfAbsent("email", "rahuldeyanshu@gmail.com") ; //if the key is not present in the map then put it.
			  
			  
			  System.out.println(hash);
			  
			  System.out.println("Name : " + hash.get("Name"));
			  System.out.println("Email : " + hash.get("Email"));
			  System.out.println("Address : " + hash.get("Address"));
			  System.out.println("Profession : " + hash.get("Profession"));
			  System.out.println("Password : " + hash.get("Password"));
			  System.out.println(hash.keySet());
			  System.out.println(hash.values());
			  
			  //check whether a key and a value exists in the Map or not
			  
			  System.out.println("Is The value"+ " " + hash.get("Password")+" " +"contains in the HashMap :"+hash.containsValue("1234567"));
			  
			  System.out.println("Is The Key"+ " " + " 'Password' " + " " + "contains in the HashMap : " + hash.containsKey("Password"));
			  
			  //How to know Size of the map
			  
			  System.out.println(hash.size());
			  
			  //How to replace a key->" value " 
			  
			  System.out.println("Name is replace with Anshu :" +hash.replace("Name", "Anshu"));
			  System.out.println("Name : " + hash.get("Name"));

			  System.out.println(hash.replace("Address", "WestBengal", "Bangalore"));
			  
			  System.out.println("Address : " + hash.get("Address"));

			  
			  //How to remove a key-Value from HashMap
			  
			  System.out.println("i remove a key from HashMap :" + hash.remove("Password"));
			  
			  System.out.println("Password : " + hash.get("Password")); // output is null
			  
			  System.out.println(hash); // Password is  deleted from HashMap
			  
			  //" isEmpty() "-> method of HashMap class is used to check for the emptiness of the map. 
			  //The method returns True if no key-value pair or mapping is present in the map else False.
			  
			  System.out.println(hash.isEmpty()) ;  //o/p -> false

		
		}
	}

