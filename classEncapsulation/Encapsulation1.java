package classEncapsulation;


class Account1 
{

	private  double balance;                       //Encapsulation -> Binding data with methods
	
	public double getBalance()
	{
		return balance;
	}
	
	public void setBalance(double balance)
	{
			if(balance > 0)
			{
				this.balance= balance;
			}
	}
	
}
	
	 class Deposit
	 {
		public  static void  deposit( double amount , Account1 ref )
		
		{
			double balance1 =  ref.getBalance(); 
			 balance1 = balance1 + amount;
			ref.setBalance(balance1);
		}
	 }
	

	 class Withdraw
		{
			public  static void  withdraw( double amount , Account1 ref1 )
			
			{
				double balance1 =  ref1.getBalance(); 
				 balance1 = balance1 - amount;
				 ref1.setBalance(balance1);
				
				 //System.out.println(balance1);
			}

		}
	 

	 public class Encapsulation1 
	 {
		 public static void main(String[] args) 
		 
		 {
		
		Account1 a=new Account1();
		Deposit.deposit(1000 , a );
		Withdraw.withdraw(500 , a);
     	Deposit.deposit(1000, a);
 		Withdraw.withdraw(500, a);
 		Withdraw.withdraw(200, a);
			
		System.out.println("total balance in your account :" + a.getBalance());
		Account1 a2 = new Account1();
	    Deposit.deposit(2000,a2);
	    System.out.println("total balance in your account :" + a2.getBalance());
			
		}

	 }
