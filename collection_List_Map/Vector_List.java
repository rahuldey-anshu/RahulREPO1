package collection_List_Map;


 import java.util.*; 
// Vector -> vector is a type of list .it implements List interface .It is almost same as ArrayList

// vector - >basically vector is a dynamic array ,we can increase the size of a vector 
public class Vector_List
{

	public static void main(String[] args) throws Exception
	
	{
		
		ArrayList<Integer> a=new ArrayList<>();     //  difference betn arraylist & Vector 
													//vector increases its capacity by 100% where arraylist increases its capacity by 50% ,so vector waste lots of memory
		Vector<Integer> v = new Vector<>();			//Vector is threadsafe where ArrayList is not thread safe 
													// vector process is slow bcz of threadsafe where ArrayList is fast.
													// we should always use ArrayList in our project
		
		v.add(50);
		v.add(41) ;
		
		v.add(60);
		v.add(51) ;

		
		v.add(70);
		v.add(61) ;

		
		v.add(80);
		v.add(71) ;
		
		v.add(90);
		v.add(81) ;

		v.add(100);
		v.add(91) ;

		
		v.add(200);
		v.add(101) ;
		
		v.add(300);
		v.add(201) ;

		
		v.add(400);
		v.add(301) ;

		
		v.add(500);
		v.add(401) ;
		
		v.add(600);
		v.add(501) ;

		v.add(700);
		v.add(601) ;


		System.out.println("Capacity of vector : " +  v.capacity());
		
		for(int i : v)
		{
			System.out.println( i);
		}
		
	}

}
