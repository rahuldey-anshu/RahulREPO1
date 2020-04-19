package classProject;

import java.util.ArrayList;

public class MyArrayList {

	public static void main(String[] args) {
		
		ArrayList <String> fruit=new ArrayList <> ();
		
		fruit.add("Rahul");
		fruit.add("Prabir");
		fruit.add("Apple");
		System.out.println(fruit);
		
		ArrayList <Integer> marks=new ArrayList <> ();
		
		marks.add(98);
		marks.add(78);
		
		
		System.out.println(marks);
		Pair<String , Integer> p1=new Pair("Rahul" , 20);  // we define generics(Pair is now a generic clss)
		Pair<Boolean , String> p2=new Pair(true, "Anshu");
		
		p1.getDes();
		p2.getDes();
		
		
		
	}

}
