package string_Problems;
import java.util.* ;
public class Delete_duplicate_char {
	
	static String delete_duplicate_char(String str)
	{
		String s = new String();
		for(int i=0 ; i<str.length() ; i++)
		{
			char c=str.charAt(i);
			
			if(s.indexOf(c) < 0 )
			{
				s=s+c ; 
			}
		}
		return s ;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in) ;
		System.out.println("Enter the String");
		String str1 = sc.nextLine() ;
		System.out.println(delete_duplicate_char(str1));
		
	}
}
