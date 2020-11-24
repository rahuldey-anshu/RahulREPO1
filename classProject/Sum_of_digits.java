package classProject;
import java.util.*;
public class Sum_of_digits {
	
	public static int sum_of_digit(int n)
	{
		int sum ;
		if(n>0)
		{
			int rem = n%10 ;
			n=n/10 ;
			 sum = rem+sum_of_digit(n);
		}
		else
			return 0;
		return sum ;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in );
		System.out.println("Enter the no");
		int n =sc.nextInt() ;
		sc.close();
		System.out.println("Sum of digits" + sum_of_digit(n));
	}

}
