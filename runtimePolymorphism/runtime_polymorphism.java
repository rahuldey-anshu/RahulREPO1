package runtimePolymorphism;

//this is runtime polymorphism
class Shape {
	void draw()
	{
		System.out.println("parent class shape!!! draw a shape");
	}
}

class Circle extends Shape{
	void draw() 
	{
		System.out.println("child class circle extends shape class!!!!draw a circle");	
	}
}

class Polygon extends Shape {
	void draw() 
	{
		System.out.println("child class polygon extends shape class!!!!draw a polygon");	
	}
}

class Rectangle extends Shape {
	void draw() 
	{
		System.out.println("child class rectangle extends shape class!!!!draw a rectangle");	
	}
}

public class runtime_polymorphism {

	public static void main(String[] args) {
		Shape s =new Shape() ;
		s.draw();
		
		s=new Circle();
		s.draw();
		
		s=new Polygon();
		s.draw();
		
		s=new Rectangle();
		s.draw();
	}

}
