package classProject;

import java.util.Scanner;

public class Leap_Year {
	
	static void leap_year(int year)
	{
		if( year % 4 == 0)
		{
			if(year % 100 == 0)
			{
				if(year % 400 == 0)
				{
					System.out.println(year +" is a leap year");
				}
				else
					System.out.println(year +" is a surely not leap year");
				
			}
			else
				System.out.println(year +" is a leap year");
			
		}
		else
			System.out.println(year +" is a surely not a leap year");
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the Year :");
		int y = sc.nextInt() ;
		
		leap_year(y);
	}

}
