package classProject;

import java.math.BigInteger;
import java.util.*;

public class Factorial_of_Biginteger_number {

	static BigInteger factorial(int n)
	{
		BigInteger f = new BigInteger("1");
		for(int i =1 ; i<n ; i++)
		{
			f = f.multiply(BigInteger.valueOf(i));
		}
		return f ;
	}
	
	public static void main(String[] args) throws Exception
	{
		int n = 100;
		System.out.println(factorial(n));
		
	}
}
