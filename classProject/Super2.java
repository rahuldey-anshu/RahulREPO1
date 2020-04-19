package classProject;



 class Super1
{
	
	int i=10;
	
}

class Super2 extends Super1
{
	
	int a=20;
	void Rahul(int a)
	{
		System.out.println(a);
		System.out.println(this.a);
	System.out.println(super.i);
	}
	public static void main(String[] args)
	{
		Super2 s=new Super2();
		s.Rahul(25);
	}
}
