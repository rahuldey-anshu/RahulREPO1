package classProject;

public class Account {
	
	private double balance;
	
	public double getBalance()
	{
		return balance;
	}
	
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	 
	public void deposit(double amount)
	
	{
		balance = balance + amount;
	}
	
	public void withdraw(double amount)
	{
		balance = balance - amount;
	}
	
	public static void main(String[] args)
	{
		Account a=new Account();
		a.deposit(1000);
		a.withdraw(500);
		a.deposit(1000);
		
		
		System.out.println("my Updated Account balance is : "  + a.getBalance());
	}

}
