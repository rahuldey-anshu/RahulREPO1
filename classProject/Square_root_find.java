package classProject;
//Square roots find to check
import java.util.*;
public class Square_root_find {

	static int res = 0 , i= 1 ;
	static int sqr_root(int x) 
	{
		if(x== 0 && x==1)
			return x ;
		else
		{
			while(res < x)
			{
				i++ ;
				res = i*i ;
				//System.out.println(res) ;
			}
		}
		return i ;
	}
	public static void main(String[] args) {
	int n;
	Scanner sc =  new Scanner(System.in) ;
	System.out.println("Enter the value of n");
	n= sc.nextInt() ;
		System.out.println(sqr_root(n));
	}
	
	}
	
