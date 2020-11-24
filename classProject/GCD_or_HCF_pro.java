package classProject;
import java.util.*;
public class GCD_or_HCF_pro {
	
	static int hcf(int n1 , int n2)
	{
		 int n=1 ;
		if(n1 != n2)
		{
			while(n!=0)
			{
				n= n1 % n2 ;
			
			if(n != 0 )
			{
				n1 = n2 ;
				n2 = n ;
			}
		
			}
		}
		return n2 ;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a1 ");
		int a1 = sc.nextInt() ;
		System.out.println("Enter the value of a2 ");
		int a2 = sc.nextInt() ;
		
		 System.out.println("HCF OR GCD is :"+ hcf(a1 , a2));
		
	}

}
