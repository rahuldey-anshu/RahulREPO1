package string_Problems;
import java.util.*;
class Abbreviation{

	public static String abbreviateName(String str){
		
        String ans="";
        
        String arr[] = str.split(" ");
        
        for(int i=0; i < arr.length-1; i++)
        {
            ans += arr[i].charAt(0) + ". ";
        }
        return  ans + arr[arr.length-1];
    }
    public static void main(String args[])
    {
        System.out.println( abbreviateName( "Bhagat Singh" ) );
        System.out.println( abbreviateName( "Mohandas Karamchand Gandhi" ) );
        System.out.println( abbreviateName( "Singh" ) );
    }
}

//--------------------using string Tokenizer--------------------------
//public class Abbreviation {
	
//	    public static String abbreviateName(String str){
//	        String ans="";
//	        StringTokenizer st = new StringTokenizer(str);
//	        int numberOfWords = st.countTokens();
//	        for(int i=0 ; i <  numberOfWords-1 ; i++){
//	            ans += ( st.nextToken() ).charAt( 0 ) + " ";
//	        }
//	        return ans+st.nextToken();
//	    }
//	 
//	    public static void main(String args[]){
//	        System.out.println( abbreviateName( "Bhagat Singh" ) );
//	        System.out.println( abbreviateName( "Mohandas Karamchand Gandhi" ) );
//	        System.out.println( abbreviateName( "Singh" ) );
//	    }
//	}


