package string_Problems;

public class Stringreplace {
	
	
	public static void main(String[] args)
	{
		String s1= "this is demo";
		String s2= "Deepak";
		
		System.out.println(s1.replace("is", "was"));
		
		System.out.println(s1.replaceFirst("is", "was"));
		
		System.out.println(s1.replaceAll("is", "was"));
		
		System.out.println(s1.replaceAll("is(.)", "was"));
		
		System.out.println(s1.replaceAll("is(.*)", "was"));
		
		
		
		System.out.println(s2.indexOf("e"));
		
		System.out.println(s2.lastIndexOf("e"));
		
		System.out.println(s2.lastIndexOf("ep"));
		
		System.out.println(s2.charAt(3));
		
		System.out.println(s2.contains("e"));
		
		System.out.println(s2.contains("ez"));
		
		System.out.println(s2.startsWith("e"));
		
		System.out.println(s2.startsWith("d"));
		
		System.out.println(s2.startsWith("D"));
		
		System.out.println(s2.endsWith("ak"));
		
		System.out.println(s2.toUpperCase());  // case conversion
		
		System.out.println(s2.toLowerCase());    // case conversion
		
		int a=10 ,b=20;
		
		System.out.println(a+b);
		
		String s3=String.valueOf(b); // type casting/conversion
		
		String s4=String.valueOf(a);    // type casting/conversion
		
		System.out.println(s3 + s4);
		
		char[] c= s3.toCharArray();      // type casting/conversion
	
	
	}
	
	

}
