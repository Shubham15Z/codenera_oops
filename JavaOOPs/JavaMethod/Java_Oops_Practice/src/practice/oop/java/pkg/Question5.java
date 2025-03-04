package practice.oop.java.pkg;

class Calculator
{
	public int add(int a, int b)
	{
		return a+b;
	}
	
	public int add(int a, int b, int c)
	{
		return a+b+c;
	}
	
	public float add(float a, int b)
	{
		return a+b;
	}
	
	public double add(int a, double b)
	{
		return a+b;
	}
}
public class Question5 
{
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		System.out.println("Addition is : "+c1.add(10,3));
		
		System.out.println("Addition is : "+c1.add(3, 5, 6));
		
		System.out.println("Addition is : "+c1.add(12.5f, 89));
		
		System.out.println("Addition is : "+c1.add(12, 8.97));
	}
}
