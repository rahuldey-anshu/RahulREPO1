package wrapperClass;


class Finalizedemo
{
	protected void finalize() throws Throwable {
		System.out.println("Object Finalized...");
	}
}
public class Finalize_demo {

	public static void main(String[] args) {
		int i=10 ;
		int o = 9;
		Integer iref = new Integer(i);  // boxing 
		
		int j=iref.intValue();   //unboxing extracting the value from object
		
		Integer kref = i;   //autoboxing
		
		int k = kref;  //Auto-unboxing
		
		System.out.println(iref);
		
		System.out.println(j);
		
		System.out.println(kref);
		
		System.out.println(k);
		
		Finalizedemo fd = new Finalizedemo();
		fd = null ;
		System.gc();

	}

}
