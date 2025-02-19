package dec.abstraction.pkg;

interface Base_Class
{
	void print();
	
	
	static void p1()
	{
		System.out.println("Static method");
	}
	
	default void p2()
	{
			System.out.println("\nDefault method");
	}
}

class Imp implements Base_Class
{
		public void print()
		{
			for(int i = 1; i <= 10; i++)
			{
				System.out.print(i+" ");
			}
		}
}

public class AbstractionByInterface 
{
	public static void main(String[] args) 
	{
		Imp ob = new Imp();
		ob.print();
		ob.p2();
		Base_Class.p1();
	}
}
