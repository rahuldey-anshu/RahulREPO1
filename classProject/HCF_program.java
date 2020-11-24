package classProject;
import java.util.*;

public class HCF_program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of a ");
		int a = sc.nextInt();
		
		System.out.println("Enter the value of  b ");
		int b = sc.nextInt() ;
		
		int small_no;
		
		small_no = a < b ? a : b ;  //Ternary operator
		System.out.println("Smallest no is : " +small_no);
		
		for(small_no = a < b ? a : b ; small_no >=1 ; small_no--)
		{
			if(a % small_no == 0 && b % small_no == 0)
			{
				break ;
			}
		}
		System.out.println("HCF or GCD is : " + small_no);
		
		
		System.out.println("Enter the value of c ");
		int c = sc.nextInt();
		System.out.println("Enter the value of d ");
		int d = sc.nextInt() ;
		int big_no = c > d ? c : d ;
		System.out.println("Biggest no is : " +big_no);
	}
}
