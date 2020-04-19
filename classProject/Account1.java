package classProject;

public class Account1 {

	private  double balance;
	
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
				
				 //System.out.println(balance1);
			}
			
			public void check_Balance(Account1 ref1)
			{
				double balance1 =  ref1.getBalance(); 
				
				System.out.println(balance1);
				
				
			}
	
			
	
		}
	 
	 
	 
	 class Test{
		 
	 
	public static void main(String[] args) {
		
	Account1 a=new Account1();
	Deposit.deposit(1000 , a );
		Withdraw.withdraw(500 , a);
		Deposit.deposit(1000, a);
		Withdraw.withdraw(500, a);
		
		//System.out.println(a.getBalance());
		
	}

}
