package classArrayProgram;

public class Char_Frequency1 {
	
	static void char_fre(String str)
	{
		int [] freq = new int[str.length()];
		char[] chararray = str.toCharArray();
		
		for(int i=0 ; i<str.length() ; i++)
		{
			freq[i] = 1 ;
			for(int j= i+1 ; j<str.length(); j++)
			{
				if(chararray[i] == chararray[j])
				{
					freq[i] ++ ;
					chararray[j] = '0';
				}
			}
		}
		for(int i=0 ; i<freq.length ; i++)
		{
			if(chararray[i]!= ' '  && chararray[i]!='0')
			{
				   System.out.print(chararray[i] + "-" + freq[i] + " "); 
			}
		}
	}
	
	public static void main(String[] args) {
		
		String s="accenture";
		char_fre(s);
		
	}

}
