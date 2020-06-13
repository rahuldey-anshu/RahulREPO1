package HashSet_Program;
/*
 * Take an array input ,and find if there exists a subarray with sum equals to zero.
 */
import java.util.*;
public class SubArray_Program {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the no of element in the array");
	int n =sc.nextInt();
	
		int [] arr = new int[n] ;
		
		System.out.println("Enter the element in the array");
		for(int i=0 ;i<arr.length ;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		boolean found = false ;
		
		Set<Integer> s = new HashSet<>();
		
		int sum = 0;
		for(int element :arr)
		{
			s.add(sum);
			sum = sum + element ;
			if(s.contains(sum))
			{
				found = true;
				break;
			}
			
		}
		System.out.println("Found" + " " + found);
	}

}
		
//		for(int i=0 ;i< arr.length ; i++)
//		{
//			int sum = 0 ;
//			for(int j=i ; j<arr.length ; j++)
//			{
//				sum = sum + arr[j];
//				if(sum == 0)
//				{
//					found = true;
//					break ;
//				}
//			}
//		}
		
		