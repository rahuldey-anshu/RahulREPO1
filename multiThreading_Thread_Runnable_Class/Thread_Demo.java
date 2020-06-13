package multiThreading_Thread_Runnable_Class;

class TaskOne extends Thread
{
	public void run()
	{
		for(int i=0 ; i<=3 ; i++)
		{
			System.out.println("Task one");
			try{
				Thread.sleep(1500);
				}
			catch(Exception e)
			{
			}
		}
	}
}

class TaskTwo extends Thread
{
	public void run()
	{
		for(int j= 0 ; j<=3 ; j++)
		{
			System.out.println("Task Two");
			try{
				Thread.sleep(1500);
				}
			catch(Exception e)
			{
			}
		}
	}
}

public class Thread_Demo {
	public static void main(String[] args) {
		
	//	System.out.println("Main() method start") ;
	

		TaskOne t1 = new TaskOne () ;
		
		TaskTwo t2 = new TaskTwo () ;
		
		t1.start();
//		System.out.println("main() ends");
		t2.start();
	}

}
