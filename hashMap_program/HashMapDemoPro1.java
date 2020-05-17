package hashMap_program;

import java.util.*;

public class HashMapDemoPro1 {

	public static void main(String[] args) {
		
		
		HashMap<Integer, String> hash = new HashMap <>() ;
		
		hash.put(1 , "Rahul Dey");
		hash.put(2 , "Anshu Dey");
		hash.put(3 , "Prabir Dey");
		
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter the student name");
		String name = sc.nextLine();
	
		if(hash.containsValue(name))
		{
			System.out.println("Student " + name + " is found in the database");
		}		
		else
		{
			System.out.println("Student " + name + " is not found in the database");
		}
	
		
	}

}
