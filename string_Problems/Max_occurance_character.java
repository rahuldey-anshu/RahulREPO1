package string_Problems;

public class Max_occurance_character {
	
	static char max_occurance(String s1)
	{
		int []arr  = new int[256];
		for(int i=0 ; i<s1.length() ; i++)
		{
			arr[s1.charAt(i)]++;
			System.out.println(s1.charAt(i));
			System.out.println(arr[s1.charAt(i)]);
		}
		int max = 0;
		char res = ' ';
		
		for(int i=0 ; i<s1.length() ; i++)
		{
			if(max < arr[s1.charAt(i)])
			{
				max = arr[s1.charAt(i)] ;
				res = s1.charAt(i);
			}
		}
		System.out.println(res +" " + max);
		return res ;
		
	}
	public static void main(String[] args) {
		  String str1 = "Happy Coding";
		  System.out.println("The given string is: " + str1);
		  System.out.println("Max occurring character in the given string is: " + max_occurance(str1));
		 }
		}
