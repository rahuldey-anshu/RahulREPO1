package classArrayProgram;
import java.util.*;
public class Capitalize_each_first_letter {
	 public static void main(String [] args) {

	       
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the String ");
	        
	        String name  = sc.nextLine();
	        
	        String n ="" ;
	        String[] str = name.split("\\s") ;
	        for(String str1 : str)
	        {
	        String upperCase = str1.substring(0, 1).toUpperCase() ;
	        String restchar = str1.substring(1,(str1.length())) ;
	        System.out.print( upperCase + " " + restchar); 
	        }
	    }


}
