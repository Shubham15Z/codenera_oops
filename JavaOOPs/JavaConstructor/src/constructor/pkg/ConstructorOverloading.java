package constructor.pkg;

public class ConstructorOverloading {
	public ConstructorOverloading() {
		System.out.println("Non para constructor");
	}
	
	ConstructorOverloading(int i)
	{
		System.out.println("Int type para constructor : ");
	}
	
	ConstructorOverloading(String s)
	{
		System.out.println("String type para constructor :");
	}
	
	ConstructorOverloading(int j, String k, boolean f)
	{
		System.out.println("Different type of para constructor : ");
	}
	
	public static void main(String args[])
	{
		ConstructorOverloading ob = new ConstructorOverloading();
		ConstructorOverloading ob1 = new ConstructorOverloading(12);
		ConstructorOverloading ob2 = new ConstructorOverloading("Ajay");
		ConstructorOverloading ob3 = new ConstructorOverloading(90, "raj", false);
		
	}
}
