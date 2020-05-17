package searching_Problem;

public class Linear_Search {

	public static void main(String[] args) {
		
		int [] arr = {7 ,8 , 1 , 10 , 4, 45} ;
		
		int item = 10 ;
		
		for(int i=0 ; i<arr.length ; i++)
		{
			if(arr[i] == item)
			{
				System.out.println("element: " + item+ " is found at index " + i);
			}
		}
		
	}

}
