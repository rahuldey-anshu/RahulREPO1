package abstractclass_Interface_Program;



abstract class Shape1{
	Shape1()
	{
		System.out.println("Shape is constructed");
	}
	abstract void draw();
	
}
class Circle1 extends Shape1{
	void draw() 
	{
		System.out.println("child class circle extends shape class!!!!draw a circle");	
	}
}

class Polygon1 extends Shape1 {
	void draw() 
	{
		System.out.println("child class polygon extends shape class!!!!draw a polygon");	
	}
}

class Rectangle1 extends Shape1 {
	void draw() 
	{
		System.out.println("child class rectangle extends shape class!!!!draw a rectangle");	
	}
}



public class abstract_class_demo {
	public static void main(String[] args) {
		Shape1 s  ;
		
		
		s=new Circle1();
		s.draw();
		
		s=new Polygon1();
		s.draw();
		
		s=new Rectangle1();
		s.draw();	
	}
}
