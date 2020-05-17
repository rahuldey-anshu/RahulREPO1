package code_Challenge;

public class Day4 {

	public static void main(String[] args) {
		
		int totalhot_Dog = 400 ;
		
		int hot_Dog_Per_Container = 8;
		
		int temp = totalhot_Dog + hot_Dog_Per_Container  ;
		
		int no_Of_Container =0 ;
		
		while(temp > hot_Dog_Per_Container )
		{
			temp =temp - hot_Dog_Per_Container ;
			no_Of_Container++ ;
		}
		System.out.println(no_Of_Container);
		
		
		
		
		
	}

}
