package practice.oop.java.pkg;

class FinalDemo
{
	final double pi = 3.14;
	
	public void print()
	{
//		pi = 2;
		System.out.println("The value of Pi is "+pi);
	}
	
	final String printFinalDetails()
	{
		return "This is final method";
	}
}

final class Total
{
	void print()
	{
		System.out.println("This is final class method..");
	}
}

class SubDemo extends FinalDemo
{
	public SubDemo() {
		System.out.println("Subdemo constructor");
	}
//	final String printFinalDetails()
//	{
//		
//	}
}

//class subTotal extends Total
//{
//	
//}

public class Question9 
{
	public static void main(String[] args) {
		FinalDemo f1 = new FinalDemo();
		f1.print();
		System.out.println(f1.printFinalDetails());
		System.out.println("-----------------------");
		FinalDemo f2 = new SubDemo();
			
		Total t1 = new Total();
		t1.print();
	}
}
