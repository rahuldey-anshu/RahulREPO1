package classProject;
import java.util.* ;
public class Auto_morphic {   
	//In mathematics, an automorphic number is a natural number
	//in a given number base whose square "ends" in the same digits as the number itself. like :- 5*5 = "25"
	
	static void auto_morphic_no(int n)
	{
		int temp , square ;
		int count = 1 ;
		
		temp = n ;
		square = n * n ;
		
		while(n!= 0)
		{
			count = count * 10 ;
			n = n/10 ;
		}
		
		if(square % count == temp)
		{
			System.out.println("it is a Automorphic number");
		}
		else
			System.out.println("it is a Non-Automorphic number");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no: ");
		int no = sc.nextInt() ;
		auto_morphic_no(no);
	}

}
