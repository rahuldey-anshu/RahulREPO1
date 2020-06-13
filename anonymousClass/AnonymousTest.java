package anonymousClass;

abstract class Person{
	abstract void eat() ;
}

public class AnonymousTest {

	public static void main(String[] args) {
		
		Person p = new Person()
		{
			void eat()
			{
				System.out.println("Anonymous class help us to override eat() method");
			}
		};
		p.eat();
	}

}
