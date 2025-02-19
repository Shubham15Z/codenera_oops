/*
By Using Abstract class
 */

package dec.abstraction.pkg;


abstract class Base
{
	abstract void addition();
	
	void substraction()
	{
		System.out.println("substraction method");
	}
}

class Subclass extends Base
{	
	
	int a = 10, b = 20; 
	
	void addition()
	{
		super.substraction();
		int add = a+b;
		System.out.println(add);
	}
}
public class AbstractionDemo 
{
	public static void main(String[] args)
	{
		Base ob = new Subclass();
		ob.addition();
		
	}
}


