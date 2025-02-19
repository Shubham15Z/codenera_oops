/*
 Demonstrate the use of this to pass the current class instance to a method in another class.
 */


package thiskeyword.superkeyword.practice.pkg;

class P1
{
	int x = 10;
	public P1() {
		P2 ob = new P2();
		ob.display(this.x);
	}
}

class P2
{
	
	void display(int a)
	{
		System.out.println(a);
	}
}

public class Question4 
{	
	public static void main(String[] args) 
	{
		P1 ob = new P1();
	}
}
