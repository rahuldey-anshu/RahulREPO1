package string_Problems;

public class Split_function {
	
	public static void main(String[] args) {
		
		String str = new String("20/11/2020");
		
		System.out.println("split(String regex):");
		
		String [] arr = str.split("/" , 4);
		
		for(String s : arr)
		{
			System.out.println(s);
		}
		
	String str1 = new String("20/11/2020/2021");
	
	System.out.println("split(String regex ,int limit) with limit=2):");
	
	String [] arr1 = str1.split("/" , 2);
	
	for(String s1 : arr1)
	{
		System.out.println(s1);
	}
	}
}
