package string_Problems;

import java.util.* ;

public class String_Concatinate {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 1st string");
		String str = sc.nextLine();
		
		System.out.println("Enter the 2nd string");
		String str1 = sc.nextLine();
		
		System.out.println("Result after concatination, the string would be: ");
		System.out.println(str +" " + str1 );
		sc.close();
		
	}

}
