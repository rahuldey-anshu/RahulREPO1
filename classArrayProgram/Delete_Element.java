package classArrayProgram;
import java.util.*;

public class Delete_Element {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of element");
		int n = sc.nextInt();
		
		char []arr = new char[n] ;
		
		System.out.println("Enter the element in the array");
		
		for(int i=0 ;i<n ;i++)
		{
			char c = sc.next().charAt(0);
			arr[i] = c ;
		}
		
		System.out.println("Array is: ");
		
		for(int i=0 ;i<arr.length ;i++)
		{
			System.out.print(" " + arr[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("Enter the character you want to delete");
		char flag = sc.next().charAt(0);
		
		for(int i = 0 ;i<arr.length ; i++)
		{
			if(flag == arr[i])
			{
				for(int j=i  ; j< arr.length-1 ; j++)
				{
					arr[j] = arr[j+1];
				}break;
				
			}
		}
	
		System.out.println("After deleting the element Array is:");
		for(int i=0 ;i<arr.length-1 ;i++)
		{
			System.out.print(" " + arr[i] + " ");
		}
			
	}

}
