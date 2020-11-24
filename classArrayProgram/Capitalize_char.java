package classArrayProgram;
import java.util.* ;

public class Capitalize_char {

	static String capitalize_char(String str)
	{
		char []arr = str.toCharArray() ;
		
		boolean foundSpace = true ;
		
		for(int i= 0 ; i< arr.length ;i++)
		{
			
			if(Character.isLetter(arr[i])) // if the array element is a letter
			{
				// check space is present before the letter
				if(foundSpace) 
				{
					
				arr[i]  = Character.toUpperCase(arr[i]) ;
				foundSpace = false ;
				}
			}
			else
				foundSpace = true ;
		}
		String str1 = String.valueOf(arr);
		return str1 ;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();
		sc.close();
		
		System.out.println(capitalize_char(s));
	}
}
