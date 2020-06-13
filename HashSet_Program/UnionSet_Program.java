package HashSet_Program;

import java.util.*;

public class UnionSet_Program {

	public static void main(String[] args) {
		Set<Integer> x = new HashSet<>();
		x.add(2);
		x.add(4);
		x.add(8);
		
		Set<Integer> y = new HashSet<>();
		y.add(1);
		y.add(4);
		y.add(6);
		
		x.addAll(y); //-> Union operation
	
		System.out.println(x);
	}

}
