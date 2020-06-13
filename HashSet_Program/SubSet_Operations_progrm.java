package HashSet_Program;

import java.util.HashSet;
import java.util.Set;

public class SubSet_Operations_progrm {

	public static void main(String[] args) {
		Set<Integer> x = new HashSet<>();
		x.add(2);
		x.add(4);
		x.add(8);
		
		Set<Integer> y = new HashSet<>();
		y.add(4);

		System.out.println(	x.containsAll(y));
		
		System.out.println(x);
		
	}

}
