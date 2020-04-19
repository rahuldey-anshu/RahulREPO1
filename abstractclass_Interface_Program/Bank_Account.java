package abstractclass_Interface_Program;


abstract class Bank
{
	abstract int rateOfInterest();
}

class SBI extends Bank
{
	int rateOfInterest()
	{
		return 7 ;
	}
}

class PNB extends Bank
{
	int rateOfInterest()
	{
		return 8 ;
	}
}

class AXIS extends Bank
{
	int rateOfInterest()
	{
		return 9;
	}
}


public class Bank_Account 
{
	public static void main(String[] args)
	{
		Bank b ;
		b =new SBI();
		System.out.println("Rate of Interest of SBI Bank :" + b.rateOfInterest() + " % ");
		
		 b= new PNB();
		System.out.println("Rate of Interest of PNB Bank :" + b.rateOfInterest() + " % ");
	
		b= new AXIS();
		System.out.println("Rate of Interest of AXIS Bank :" + b.rateOfInterest() + " % ");
	
	
	
	}

}
