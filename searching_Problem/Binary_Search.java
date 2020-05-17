package searching_Problem;

public class Binary_Search {

	public static void main(String[] args) {
		
		int [] arr = {2, 5, 7 , 9 , 12 , 14, 16, 17, 19 , 20 , 24 , 28} ;
		
		int search = 28 ;
		int li = 0;
		int hi = arr.length-1 ;
		int mi =(li+hi)/2 ;
		
	while(li <= hi)
	{
		if(arr[mi] == search)
		{
			System.out.println("element is at "+ mi +" index position" );
			break;
		}
		else if(arr[mi] < search)
		{
			li = mi+1 ;
		}
		else
		{
			hi = mi-1 ;
		}
		
		mi = (li+hi)/2 ;
		
	 }
	if(li > hi)
	{
		System.out.println("Element is not found");
	}
	}

}
