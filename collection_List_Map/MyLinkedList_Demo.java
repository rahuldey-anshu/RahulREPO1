package collection_List_Map;

// import java.util.LinkedList;

public class MyLinkedList_Demo {

	public static void main(String[] args) {
		
		
		LinkedListDemo<String> ll = new LinkedListDemo<>();		// LinkedListDemo is a new java-file as well as class, for which i create an object 
		
//		ll.add(12);
//		ll.add(56);
		
		for(int i =0 ; i<=10 ; i++)
		{
			ll.add(i + " "  +"Rahul" + "/");    // i can add string also bcz now my class is generic class
			ll.add("Anshu" + ":");
		}
		
		
		ll.print();
	
	}
	

}
