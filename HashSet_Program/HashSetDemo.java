package HashSet_Program;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		
		HashSet<String> h = new HashSet<>();
		
		h.add("Rahul");
		h.add("Anshu");
		h.add("Babu");
		h.add("Rohit");
		System.out.println(h);
		
		System.out.println(h.size());
		
		h.remove("Rahul");
		System.out.println(h);
		System.out.println(h.contains("Rohit"));
		
		

		HashSet<Integer> h1 = new HashSet<>();
		h1.add(20);
		h1.add(6);
		h1.add(4);
		h1.add(8);
		
		Object[] a = h1.toArray();
		System.out.println("===============================================");
		System.out.println(a[2]);
		
		System.out.println(h1.hashCode()); //o/p-> 38
		
		
	}

}
