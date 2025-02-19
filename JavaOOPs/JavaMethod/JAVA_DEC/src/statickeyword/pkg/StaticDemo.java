package statickeyword.pkg;

public class StaticDemo 
{
//	int i = 1;
	static int i = 1;
	void print()
	{
		System.out.println(i);
		i++;
	}
	
	public static void main(String[] args) 
	{
		StaticDemo ob = new StaticDemo();
		StaticDemo ob1 = new StaticDemo();
		StaticDemo ob2 = new StaticDemo();
		
		ob.print();
		ob1.print();
		ob2.print();
		ob.print();
	}
}
