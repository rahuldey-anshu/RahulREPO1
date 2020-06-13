package recursion_Problem;
//Find the sum of 1st n natural nos

public class Sum {

	public static void main(String[] args) {
		System.out.println(sum1(15));
		
	}
		static int sum1(int n)
		{
			if(n == 1)
			{
				return 1 ;
			}
			
			return n + sum1(n-1) ;
			
		}
}
