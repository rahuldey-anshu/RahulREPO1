package classProject;

 class ThisVariabl 
 {
	int i;
	void thisVariable(int i)
	{
		this.i=i;
	}
void show()
{
	System.out.println("the value of the instance variable is : " + i);
}
 }
 public class ThisVariable{
	 
	public static void main(String[] args) {
		
		ThisVariabl n=new ThisVariabl();
		n.thisVariable(10);
		n.show();
		
	}

}
