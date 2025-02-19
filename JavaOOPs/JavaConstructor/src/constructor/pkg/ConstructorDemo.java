package constructor.pkg;

public class ConstructorDemo {
	
	ConstructorDemo()
	{
		System.out.println("Constructor called....");
	}
	
	ConstructorDemo(int k, String st)
	{
		System.out.println("Constructor with paraeters : "+k+", "+st);
	}
	public static void main(String args[])
	{
		ConstructorDemo ob = new ConstructorDemo();
		ConstructorDemo ob1 = new ConstructorDemo(10, "Ajay");
	}
}
