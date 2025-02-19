package thiskeyword.pkg;

public class ThisKeyUse1 
{
	int a;
	
	void display()
	{
		System.out.println(a);
	}
	void print(int a)
	{
		this.a = a;
		System.out.println(this.a);
	}
	
	
	public static void main(String[] args)
	{
		ThisKeyUse1 ob = new ThisKeyUse1();
		ob.display();
		ob.print(100);
		
	}
}
