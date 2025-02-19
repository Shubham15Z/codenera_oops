package statickeyword.pkg;

public class StaticPractice 
{
	public StaticPractice() {
		System.out.println("Constructor");
	}
	void m2()
	{
		System.out.println("Non static method m2");
		m1();
	}
	static void m1()
	{
		System.out.println("static Method m1");
		
	}
	
	static
	{
		System.out.println("Static block 1");
//		m1();
	}
	
	public static void main(String[] args) {
//		m1();
		StaticPractice ob = new StaticPractice();
		ob.m2();
	}
	
	
}
