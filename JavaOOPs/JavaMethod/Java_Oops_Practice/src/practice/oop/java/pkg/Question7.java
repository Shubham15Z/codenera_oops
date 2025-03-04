package practice.oop.java.pkg;

class Parent
{
	public Parent() {
		System.out.println("Parent constructor");
	}
	
	public void print()
	{
		System.out.println("Parent print method");
	}
}

class Child extends Parent
{
	Child()
	{
		super();
	}
	
	public void print()
	{
		super.print();
	}
}
public class Question7 
{
	public static void main(String[] args)
	{
		Parent p1 = new Child();
		p1.print();
		
	}
}
