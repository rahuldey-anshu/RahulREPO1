package searching_Problem;

import java.util.*;

public class Binary_Search_userinput {

 public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);

  System.out.println("Enter the no of element in the array");

  int n = sc.nextInt();

  System.out.println("Enter the elements");

  int arr[] = new int[n];

  for (int i = 0; i < n; i++) {
   arr[i] = sc.nextInt();
  }
  Arrays.sort(arr);
  		
   System.out.print(" Sorted array is : ") ;
	
  for (int i = 0; i < arr.length; i++)
  {
   System.out.print(" " + arr[i]);
  }
  System.out.println();
  
  System.out.println("Enter the element You want to search");

  int search = sc.nextInt();

  int li = 0;
  int hi = arr.length - 1;

  int mi = (li + hi) / 2;

  while (li <= hi)
  {
   if (arr[mi] == search)
   {
    System.out.println("Searching element found at index" + mi);
    break;
   } 
   else if (arr[mi] < search) 
   {
    li = mi + 1;
   } 
   else
   {
    hi = mi - 1;
   }

   mi = (li + hi) / 2;

  }
  
  if (li > hi) 
  {
   System.out.println("Element not found");
  }
 }
}