package classProject;
import java.util.*;
public class Carry_digits {
	
	public static int carry(int n1 , int n2)
	{
		int sum =0, carry=0 , count=0;
		while((n1!=0) && (n2 !=0))
		{
			int p = n1 % 10 ;
			int q = n2 % 10 ;
			sum = p+q + carry;
			if(sum > 9)
			{
				carry = 1 ;
				count++ ;
			}
			else {
				carry = 0;
			}
			n1 = n1/10 ;
			n2 = n2/10 ;
		}
		return count ;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n1");
		int n1 = sc.nextInt();
		System.out.println("Enter the value of n2");

		int n2 = sc.nextInt();
		
		System.out.print("Total no of carry is: ");
		
		System.out.println(carry(n1 , n2));
		
	}

}
