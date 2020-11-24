package string_Problems;

import java.util.Scanner;

public class Frequency_checking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
		
		 System.out.println("Enter the  string");
		 String str = sc.nextLine();
		 
		 char[] ch = str.toCharArray() ;
		 
		 for(int i=0 ; i<ch.length ; i++)
		 {
			 int index = i;
			int count = 0 ;
			for(int j= 0 ; j<ch.length ; j++)
			{
				if(j<i && (ch[j] == ch[i]))
				{
					break ;
				}
				if(ch[index] == ch[j])
				{
					count++ ;
				}
			}
			if(count > 0)
			{
				System.out.println(ch[i] + " is " + count + " Times ");
			}
		 }
		 
		 

	}

}
