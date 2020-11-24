package classProject;

import java.util.*;
public class Factorial_normal {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num  = sc.nextInt();
		
		if(num >=0)
		{
			int fact = 1 ,i;
			for( i=num  ; i>=1 ; i--)
			{
				fact = fact*i ;
				//System.out.println( fact+ " * " + i +" = " + fact);

			}
			System.out.println("factorial of " + num + " is "  + "=" +fact );
		}
		else
			System.out.println("Value is not defined, please re-enter the value");
		sc.close();	
		
		
	}

}
