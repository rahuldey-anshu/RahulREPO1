package string_Problems;
import java.util.*;
public class Replace_Character {
	
	 static String replace_char(String str)
	 {

		 char ch1 = 'e' ;
		 char  ch2 = 'o';
		 
		 char[] arr = str.toCharArray();
		 for(int i=0 ; i<arr.length ; i++)
		 {
			 if(arr[i] == ch1)
			 {
				 arr[i] = ch2 ;
			 }
			 else if(arr[i] == ch2)
			 {
				 arr[i] = ch1 ;
			 }
		 }
		 String s = new String(arr);
		 
		 return s;
		 
	 }
	 
	 public static void main(String[] args) {
		
		 String s = new String();
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the String");
		 s= sc.nextLine();
		 System.out.print("After replacing these characters the String is: ");
		 System.out.print(replace_char(s));
	}

}
