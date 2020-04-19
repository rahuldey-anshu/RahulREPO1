package classProject;

  public class Account_Encapsulation
  {

	 private double balance;
	 
	 public Account_Encapsulation()
	 {
		 balance = 0;
	 }
	 
	 public Account_Encapsulation(double b )
	 {
		 balance = b;
	 }
	
	  public void deposit(double amount)
	   {
		  
		  if(balance >0)
			  
		  	{
			  
			balance +=amount;
			
		  	}
		  return ;
	   }
	
	  public void withdraw(double amount)
	  {
		  if(balance > 0)
		  	{
			balance = balance - amount ;
		  	}
		  return ;
	  }
	
	  public double getBalance()
	  {
		return balance;
		
	  }
	  
	
	public static void main(String [ ]  args)
	{
		Account_Encapsulation e=new Account_Encapsulation(1000.50);
		
			e.deposit(500.25);
			e.withdraw(300.25);
			e.deposit(200.12);
			
		
		
			
			System.out.println("new balance in the account: " + e.getBalance());
			
							
	}

	

	}
