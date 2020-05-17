package string_Problems;

public class StringCount {

	public static void main(String[] args) {
		
		String str = "Rahul loves Java a lot" ;
		int char_count  = 0;
		int char_count1 =  0 ;
		
		for(int i=0 ; i<str.length() ; i++)
		{
			if(str.charAt(i) == 'a')
			{
				char_count++ ;
			}
		}
		
		
		for(char ch: str.toCharArray())
		{
            if(ch == 'l')
            {
                char_count1++;
            }
        }    


		System.out.println("count of character 'a' on String: " + str + " = " + char_count);
		System.out.println("count of character 'l' on String: " + str + " = " + char_count1);
		
	}
}
