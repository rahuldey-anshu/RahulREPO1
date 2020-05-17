package code_Challenge;

public class Day5 {
	
	public static void main(String[] args) {
		
		int secRounds[] = {66,57,54,53,64,52,59} ;
		int n = secRounds.length;
		int temp =0;
		int i,j ;
		for( i=0 ; i < n  ; i++)
		{
			for( j= 1 ; j< n-i ; j++)
			{
				if(secRounds[j-1] > secRounds[j])
				{
					temp = secRounds[j-1] ;
					secRounds[j-1] = secRounds[j] ;
					secRounds[j] = temp ;
					
				}
			}
			
		}
		for(i = 0 ;i< n ;i++)
		{
		System.out.println(secRounds[i]);
		}
		System.out.println("best time is =" + secRounds[0]);
		System.out.println("worst time is =" + secRounds[n-1]);
	}

}
