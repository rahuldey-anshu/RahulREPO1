package string_Problems;

public class StringBuffer_StringBuilder {

	public static void main(String[] args) {
		
		String str = new String("Hello");  //String are immutable
		
		StringBuffer sb = new StringBuffer("Hello");  //StringBuffer are mutable
		
		StringBuilder sb1 = new StringBuilder("Hello");  ////StringBuilder are mutable
		
		str.concat("Rahul");
		
		sb.append("Rahul dey");
		
		sb1.append("Rahul dey anshu");
		
		System.out.println(str); //immutable o/p ->Hello
		
		System.out.println(sb);  //mutable  o/p ->HelloRahul dey
		
		System.out.println(sb1);  //mutable  o/p -> HelloRahul dey anshu
	}

}
