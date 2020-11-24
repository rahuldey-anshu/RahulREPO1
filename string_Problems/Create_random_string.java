package string_Problems;

import java.util.*;

public class Create_random_string {
	
	static String random(String str)
	{
		
		StringBuilder sb = new StringBuilder() ;
		
		Random r = new Random(); // create an object of Random class
		
		int len = 8 ;
		
		for(int i= 0 ; i< len ; i++)
		{
			int index = r.nextInt(str.length()) ; // generate random index number
			
			char ran_char = str.charAt(index) ; //get character specified by index from the string
		      							
			sb.append(ran_char) ;
		}
		
		String ran_string = sb.toString() ;
		return ran_string ;
	}
	public static void main(String[] args) {
		String str= "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghizklmnopqrstuvwxyz@#$&1234567890" ;
		System.out.println("Random String is : " + random(str) ); 
	}

}
