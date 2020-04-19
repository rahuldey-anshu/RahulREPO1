package classEncapsulation;

public class OverloadingDemo {

	public static void main(String[] args) 
	{	 
		 //       System.out.println("Hi Geek (from main)"); 
		
		      main("Rajesh Swami");
		      main("Dear Rahul", "My name is Anshu");
		      main("Dear Rahul", "My name is Anshu" , "i am an engineer"); 
		   }
		  
		    // Overloaded main methods 
		    public static void main(String arg1) 
		    { 
		        System.out.println("Hi, " + arg1); 
		        
		    } 
		    public static void main(String arg1, String arg2) 
		    { 
		        System.out.println("Hi, " + arg1 + ", " + arg2); 
		        
			    
		    } 
	
		    public static void main(String arg3, String arg4, String arg5) 
		    { 
		        System.out.println("Hi, "+ arg3+ " , " + arg4 + ", " + arg5); 
		    } 
	
}

