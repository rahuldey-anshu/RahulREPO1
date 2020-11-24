package classProject;
import java.util.*;
public class Armstrong_no {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int start , end , n ;
		System.out.println("Enter the starting value");
		start = sc.nextInt();
		
		System.out.println("Enter the ending value");
		end = sc.nextInt();
		System.out.println("armstrong nos are");
		for(int i=start ; i<=end ; i++)
		{
			n=i ;
			int  sum = 0 ;
			while(n!=0)
			{
				int rem = n % 10 ;
				sum = sum +(rem*rem*rem);
				n=n/10;
			}
			
			if(sum == i)
			{
				
				System.out.print( " " + i + " ");
			}
		}
	}

}
