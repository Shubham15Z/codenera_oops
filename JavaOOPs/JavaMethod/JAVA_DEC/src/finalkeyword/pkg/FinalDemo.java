package finalkeyword.pkg;

class Raja
{
	 void saja()
	{
		System.out.println("Raja is giving saja.");
	}
}

class Praja extends Raja
{
	void saja()
	{
		System.out.println("praja getting saja ");
	}
}
public class FinalDemo {
	public static void main(String[] args)
	{
		final int a = 10;
//		a = 100;
	}
}
