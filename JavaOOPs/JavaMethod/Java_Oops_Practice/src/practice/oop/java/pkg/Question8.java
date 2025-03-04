package practice.oop.java.pkg;

class DemoConstructor
{
	DemoConstructor() {
		System.out.println("This is default constructor");
	}
	
	DemoConstructor(int b)
	{
		this();
		System.out.println(b);
		
	}
}
public class Question8 
{
	public static void main(String[] args) 
	{
		DemoConstructor d1 = new DemoConstructor(5);
	}
}
