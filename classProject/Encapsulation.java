package classProject;

public class Encapsulation {
	
		private float balance;
		
		Encapsulation(float balance)
		{
			this.balance=balance;
		}
	
	
	public void deposit(float amount)
	{
		if(balance >0)
		{
			balance +=amount;
		}
	}
	
	public void withdraw(float amount)
	{
		if(balance > 0)
		{
			balance = balance - amount ;
		}
	}
	
	public float getBalance()
	{
		return balance;
		
	}
	
	public static void main(String [ ]  args)
	{
		Encapsulation e=new Encapsulation(1000);
				{
					e.deposit(500);
					e.withdraw(400);
					System.out.println(e.getBalance());			
				}
	}
	
}