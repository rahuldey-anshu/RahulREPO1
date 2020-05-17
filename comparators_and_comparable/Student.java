package comparators_and_comparable;

public class Student implements Comparable <Student> {

	int marks ;
	String name ;
	
	public Student(int marks, String name) {
		super();
		this.marks = marks;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [marks=" + marks + ", name=" + name + "]";
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Student obj) {
		
		if(this.marks > obj.marks)
		{
			return 1 ;
		}
		else if(this.marks < obj.marks)
		{
			return -1 ;
		}
		
		return this.name.compareTo(obj.name) ; // when marks are same then it will sort according to name
	}
	
}

/*
 * 
 * 
//Java program to demonstrate working of Comparator 
//interface 
import java.util.*; 
import java.lang.*; 
import java.io.*; 

//A class to represent a student. 
class Student 
{ 
 int rollno; 
 String name, address; 

 // Constructor 
 public Student(int rollno, String name, 
                            String address) 
 { 
     this.rollno = rollno; 
     this.name = name; 
     this.address = address; 
 } 

 // Used to print student details in main() 
 public String toString() 
 { 
     return this.rollno + " " + this.name + 
                        " " + this.address; 
 } 
} 

class Sortbyroll implements Comparator<Student> 
{ 
 // Used for sorting in ascending order of 
 // roll number 
 public int compare(Student a, Student b) 
 { 
     return a.rollno - b.rollno; 
 } 
} 

//Driver class 
class Main 
{ 
 public static void main (String[] args) 
 { 
     Student [] arr = {new Student(111, "bbbb", "london"), 
                       new Student(131, "aaaa", "nyc"), 
                       new Student(121, "cccc", "jaipur")}; 

     System.out.println("Unsorted"); 
     for (int i=0; i<arr.length; i++) 
         System.out.println(arr[i]); 

     Arrays.sort(arr, new Sortbyroll()); 

     System.out.println("\nSorted by rollno"); 
     for (int i=0; i<arr.length; i++) 
         System.out.println(arr[i]); 
 } 
} 
*/
