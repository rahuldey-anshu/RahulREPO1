package classArrayProgram;

import java.util.* ;
public class Delete_duplicate_character {
	
	static void delete_duplicate_char(String str)
	{
		char[] arr = str.toCharArray() ;
		
		for(int i=0 ; i<arr.length ; i++)
		{
			for(int j=i ;j<arr.length ;j++)
			{
				if(arr[i] == arr[j] && (i!=j))
				{
					
					System.out.print(" " +arr[j]+ " ");
				}
			}
		}
//		String s = new String(arr) ;
//		return s ;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		
		String str = sc.nextLine() ;
//		System.out.print(delete_duplicate_char(str));
		delete_duplicate_char(str);
	}
	

}
