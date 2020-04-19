package classProject;

import java.util.*;

 public class Main
 
 {
	 
public static void main(String[ ] args)
{
System.out.println("enter the no");

int no=new Scanner(System.in).nextInt();

System.out.println("Reverse of number: "+ no + "  ïs " + reverse(no) );

}

public static int reverse(int no)
{
	int reverse =0;
	int rem= 0;
	
	do {
		rem=no % 10;
		reverse = reverse *10 +rem;
		
		no=no/10;
	}
	while(no>0);
	{
		return reverse;
	}
}

 }

 


