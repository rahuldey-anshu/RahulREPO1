package HashSet_Program;

import java.util.*;

public class SubArray_program1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of element in the array");
		int n =sc.nextInt();
		
			int [] arr = new int[n] ;
			
			System.out.println("Enter the elements in the array");
			for(int i=0 ;i<arr.length ;i++)
			{
				arr[i] = sc.nextInt();
			}
			int k = 6 ;
			boolean found = false ;
			int sum = 0;
			Set<Integer> s = new HashSet<>();
			for(int element : arr)
			{
			
				s.add(sum);
				sum = sum + element ;
			
				if(s.contains(sum-k))
				  {
					found = true ;
					break ; 
				  }
			}
			System.out.println("Found" + " " + found);
			System.out.println(sum);
	}

}
