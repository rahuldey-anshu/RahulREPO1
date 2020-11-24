package Home_Practice;
import java.util.* ;
public class Even_Odd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of elements in the array");
		int n = sc.nextInt() ;
		
		int [] arr = new int [n] ;
		
		System.out.println("Enter the elements in the array");
		for(int i=0 ; i< n ; i++)
		{
		arr[i] = sc.nextInt() ;
		}
		
		for(int i=0 ; i<arr.length ; i++)
		{
			if(arr[i] % 2 == 0 )
			{
				System.out.println(arr[i] + " is Even no");
			}
			else
				System.out.println(arr[i] + " is Odd No");
		}
			
		
	}

}
