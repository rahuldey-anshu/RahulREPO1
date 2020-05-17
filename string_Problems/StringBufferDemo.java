package string_Problems;

public class StringBufferDemo {
	
	
	public static void main(String[] args)
	{
		StringBuffer sb=new StringBuffer("Rahul");
		
		System.out.println(sb);
		
		System.out.println(sb.capacity()); // 16 character can store in sb object + arguments (16+5)=21
		
		System.out.println(sb.capacity());
		
		StringBuffer sb1=new StringBuffer();
		
		System.out.println(sb1.capacity());
		
		sb1.append("hello");
		System.out.println(sb1.capacity());
		
		sb1.append("rahul deywse");
		System.out.println(sb1.capacity());
		
		System.out.println(sb1.length());
		
		System.out.println(sb.append("RD"));
		
		System.out.println(sb1.delete(2, 5)); // it delete from index (2 to 5-1) index elements
		
		System.out.println(sb.deleteCharAt(3));
		
		StringBuffer sb3=new StringBuffer("Deepak Java");
		
		StringBuffer sb4=new StringBuffer("Deepak Java");
		
		System.out.println(sb3.equals(sb4));
		

		StringBuffer sb5=new StringBuffer("Deepak Java");
		
		StringBuffer sb6=sb5.append("hii");
		
		System.out.println(sb5.equals(sb6));
		
		
		
	}

}
