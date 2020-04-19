package collection_List_Map;

//import java.util.*;

// main method is created in [MyLinkedListDemo.java] file

public class LinkedListDemo<E>  // my class is now a generic class
{
	
	static class Node<E>
	{
		E data ;
		Node<E> next;
	
	
		public Node(E data)
		{
			this.data = data;
			next = null;
		}
	}
	
	Node<E> head;

	void add(E data)
	{
		Node<E> toAdd = new Node<E>(data);     //create toAdd object 
		
//		if(head == null)
//		{
//			head = toAdd;
//			return ;
//		}
		
		if(isEmpty() )			// if head is found null then new node will be added to the head
		{
			head =  toAdd;
			return ;
		}

		Node<E> temp = head ; 		//take temp to store head
		
		while(temp.next != null )
		{
			temp = temp.next;
		}
		temp.next = toAdd ;  // when it found null then a node will be added to temp->next using toAdd object
	
	}
	
	boolean isEmpty()					//this method return true/ false .
	
	{
		return head == null ;
	}

	
	void print()			// prE the element of linkedlist
	{
		Node<E> temp = head;
		while(temp != null)
		{
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	
//	boolean isEmpty()				//this method works same as below the method.
//	{
//		if(head == null)
//		{
//			return true ;
//		}
//		else
//		{
//			return false ;
//		}
//	}

	

}
