/*
10.Wap to show an example of method overloading and method overriding. using string.
 */

package dec.java.str.methods;

class Parent10 
{
	void display(String s1)
	{
		System.out.println("This method contains one string argument "+s1);
	}
	
	void display(String s1, String s2)
	{
		System.out.println("This method contains two String arguments : "+s1+" and "+s2);
	}
	
	void print(String s3)
	{
		System.out.println("This is string from parent : "+s3);
	}
}

class Child10 extends Parent10
{
	void print(String s3)
	{
		System.out.println("This is string from child :"+s3);
	}
}

public class Question10 
{
	public static void main(String[] args) {
		Parent10 p10 = new Parent10();
		p10.display("Hello");
		p10.display("Hello", "World");
		
		System.out.println("-----------------------------------");
		Parent10 c10 = new Child10();
		c10.display("Ajay");
		c10.display("Ajay", "Vijay");
		c10.print("Rahul");
		
	}
}
