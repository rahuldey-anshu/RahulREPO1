package classProject;

import java.io.FileInputStream;
public class ExceptionDemo {

	public static void main(String[] args) 
	{
	    try
	    {
	    	FileInputStream fi=new FileInputStream("d:/abc.text"); 
	    }
	    
	    catch(Exception e)
	    {
    	System.out.println(e);
	    	
	    }
	    System.out.println("hello world");

		
	}

}
