package collection_List_Map;
import java.util.*;

public class Sum_of_even_odd_no {

	public static void main(String[] args) {
		
	List<Integer> list = new ArrayList<>() ;
	list.add(3) ;
	list.add(4) ;
	list.add(5) ;
	list.add(6) ;
	list.add(7) ;
	list.add(8) ;
	
	
	int even_sum = 0 ;
	int odd_sum = 0 ;
	int n = list.size() ;
	System.out.println("Size of the list is :" + n);
	System.out.println(list);
	
	for(int i : list)
	{
		if(i%2 == 0)
		{
			even_sum =even_sum + i ;
		}
		else
		{
			odd_sum = odd_sum + i ;
		}
	}
	System.out.println("Even no summation is : " + even_sum);
	System.out.println("Odd no summation is : "  + odd_sum);
		
	}

}
