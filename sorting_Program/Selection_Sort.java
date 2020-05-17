package sorting_Program;
// Selection sort for Integer
import java.util.*;
public class Selection_Sort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int min ;
		int temp = 0 ;
		System.out.println("Enter the no of Element you want in the array");
		int n = sc.nextInt();
		int [] arr = new int[n];
		System.out.println("Enter the  Element in the array ");
		for(int i = 0 ; i < n ; i++)
		{
		arr[i] = sc.nextInt();
		}
		
		for(int i=0 ; i<arr.length ; i++)
		{
			min = i;
			for(int j=i+1 ; j<arr.length ; j++)
			{
				if(arr[j] < arr[min])
				{
					min = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp ;
		}
		System.out.println("Using selection sort we got the Sorted array :");
		for(int i=0 ; i< arr.length ; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}

}
