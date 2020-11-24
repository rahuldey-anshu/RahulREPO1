package classArrayProgram;

import java.util.Scanner;

public class Vowel_remove {
	
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);

		char[] vowel = {'a' , 'e' , 'i' , 'o' , 'u'} ;
		
		int []count = {0,0,0,0,0} ;
		
		
		System.out.println("Enter the String");
		String s = new String();
		for(int i=0 ; i<s.length() ;i++)
		{
			s = sc.nextLine();
		}
		char []arr = new char[20] ;
		arr= s.toCharArray();
		
		char[] temp = new char[20];
		int j=0 ;
		
		int flag = 0 ;
		
		for(int i=0 ; i<arr.length ; i++)
		{
			if(arr[i] == 'a' || arr[i] == 'A')
			{
				count[0]++ ;
			}
			else if(arr[i] == 'e' || arr[i] == 'E')
			{
				count[1]++ ;
			}
			else if(arr[i] == 'i' || arr[i] == 'I')
			{
				count[2]++ ;
			}
			else if(arr[i] == 'o' || arr[i] == 'O')
			{
				count[3]++ ;
			}
			else if(arr[i] == 'u' || arr[i] == 'U')
			{
				count[4]++ ;
			}
			else
			{
				temp[j++] = arr[i] ;
			}
				
		}
		
		for(int i=0 ; i<count.length ;i++)
		{
			if(count[i] !=0)
			{
				flag =0 ;
				break ;
			}
		}
		
		if(flag == 1)
		{
			for(int i=0 ;i<arr.length ; i++)
			{
				System.out.println(vowel[i] + count[i]);
			}
			for(int i=0 ;i<temp.length ; i++)
			{
				System.out.println(temp[i]);
			}
			
		}
//		else
//			System.out.println("0");
//		
		
	}

}
