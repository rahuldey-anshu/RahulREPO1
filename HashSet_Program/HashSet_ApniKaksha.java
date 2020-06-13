package HashSet_Program;
import java.util.*;

public class HashSet_ApniKaksha {

	public static void main(String[] args) {
		
		Set<String> fruits = new HashSet<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Kiwi");
		
		System.out.println(fruits.add("Kiwi"));
		
		System.out.println(fruits); // HashSet doesnot provide any odering of elements.
		
	}

}
