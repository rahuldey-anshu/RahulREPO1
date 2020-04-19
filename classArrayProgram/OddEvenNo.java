//Find even and Odd no in an array and perform addition of odd no and even no

package classArrayProgram;

import java.util.*;

public class OddEvenNo 
{

	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		 int i;
		 System.out.println("Enter the no of element that you want in your array");
		
		 		int n=sc.nextInt();
		
		 			int []a=new int[n];
		
		 System.out.println("enter the elements in the array:");
		 
		 	for(i=0;i<a.length ; i++)
		 		{
		 			a[i] = sc.nextInt();
		 		}
		 	
		 ArrayList<Integer> al1=new ArrayList<>();
		
 		ArrayList<Integer> al2= new ArrayList<>();
		
		 	for(i=0;i<a.length ; i++)
		 		{
		 			if(a[i] % 2 == 0)
		 			{
		 					al1.add(a[i]);
		 			}
		
		            else
		            {
		            		al2.add(a[i]);
		            }
		 		}
		 	
		 	//EVEN NO
		 	
		 	System.out.println("Even nos are:");
		 	
		 	int temp = 0;
		 	
		 	for(int no: al1)
		 	{
		 		 temp = temp + no;
		 		 
		 		System.out.print(" " + no + " " );	
		 	}
		 	
		 	System.out.println();
		 	
		 
		 	
		 	System.out.println("Total no of even nos are : "+ al1.size());
		 	
			System.out.println("addition of even nos :" + temp);
		 	
		 	//ODD NO
		 	System.out.println("------------------------------------------------------------------");
		 	System.out.println("Odd nos are:");
		 	int temp1=0;
		 	for(int no1: al2)
		 	{
		 		temp1 = temp1 + no1;
		 		
		 		System.out.print("" + no1 + " ");
		 		
		 	}
		 	System.out.println();
		 	
			System.out.println("Total no of odd nos are : "+ al2.size());
			
			System.out.println("addition of odd nos :" + temp1);
		
		
	}

}
