package string_Problems;

import java.util.Scanner;

/* removeDirtyChars takes two string as arguments: First 
string (str)  is the one from where function removes dirty 
characters. Second  string is the string which contain all 
dirty characters which need to be removed  from first string */


public class RemoveStrings {
	 

	 static  int b = 256; 

	    static int[] countArray(String str) 
	    { 
	       int count[] = new int[b]; 
	       for (int i = 0; i<str.length(); i++) 
	          count[str.charAt(i)]++; 
	         
	       return count; 
	    } 
	      
	   
	    static String removeDirtyChars(String str, String mask_str) 
	    { 
	      int count[]  = countArray(mask_str); 
	      int i = 0, j = 0; 
	        
	      char arr[] = str.toCharArray(); 
	        
	      while (i != arr.length) 
	      { 
	        char temp = arr[i]; 
	        if(count[temp] == 0) 
	        { 
	            arr[j] = arr[i]; 
	           j++; 
	        } 
	            i++; 
	          
	      }     
	  
	      str = new String(arr); 
	        
	      return str.substring(0, j); 
	        
	    } 
	      
	    // Driver Method 
	    public static void main(String[] args) 
	    { 
	    	Scanner sc = new Scanner(System.in);
	    	
	    	System.out.println("Enter the original string");
			String str = sc.nextLine() ;
			
			System.out.println("Enter the string want to remove from the original String");
			String mask_str = sc.nextLine() ;
			
	        System.out.println(removeDirtyChars(str, mask_str)); 
	    } 
	} 

