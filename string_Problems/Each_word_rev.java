package string_Problems;
import java.util.*;
public class Each_word_rev {

	static void word_rev(String str)
	{
		String[] arr = str.split(" ") ;
		
		for(int i=0 ; i<arr.length ; i++)
		{
			char[] arr1 = arr[i].toCharArray() ;
		
			for(int j= arr1.length-1 ; j>=0 ; j--)
			{
				System.out.print(arr1[j]);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string");
		
		String str = sc.nextLine() ;
		word_rev( str);
		
	}
}
