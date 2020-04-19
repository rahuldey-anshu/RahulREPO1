package classProject;
import java.util.*;

public class MainLinkedList {

	public static void main(String[] args) {
		
		List<Integer> ll=new LinkedList<>();
		List<Integer> al=new ArrayList<>();
		
		
		getTimeDiff(al);
		getTimeDiff(ll);
//		
//		ll.add(20);
//		ll.add(02);
//		ll.add(32);

		
		System.out.println(ll);
	
		System.out.println(ll.get(1));
		
	}
	
	static void getTimeDiff(List<Integer> list)
	{
		long start = System.currentTimeMillis();
		for(int i=0 ; i<100 ; i++)
		{
			list.add(0, i);
		}
		
		long end = System.currentTimeMillis(); 
		
		System.out.println(list.getClass().getName() + 	"   -->  " + (end - start));
		
	}
	

}
