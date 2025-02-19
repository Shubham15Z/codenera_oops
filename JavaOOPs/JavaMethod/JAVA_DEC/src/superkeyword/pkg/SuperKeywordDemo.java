package superkeyword.pkg;


class Father
{
	int x;
	
	void m1()
	{
		System.out.println("m1 method");
	}
	
}

class Son extends Father
{
	void init(int x)
	{
		super.x=x;
		System.out.println(x);
		super.m1();
	}
	
}
public class SuperKeywordDemo {
	public static void main(String[] args) 
	{
		Son ob = new Son();
		ob.init(10);
	}
}
