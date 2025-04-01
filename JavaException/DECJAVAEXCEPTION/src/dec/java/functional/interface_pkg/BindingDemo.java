package dec.java.functional.interface_pkg;

class P1
{
	public void print()
	{
		System.out.println("Hii from Parent");
	}
	
	static void show()
	{
		System.out.println("Hii from Parent");
	}
}

class C1 extends P1
{
	public void print()
	{
		System.out.println("Hii from Child");
	}
	
	static void show()
	{
		System.out.println("Hii from Child");
	}
}
public class BindingDemo 
{
	public static void main(String[] args) {
		P1 cp = new C1();
		cp.print();
		System.out.println("--------------");
		cp.show();
	}
}
