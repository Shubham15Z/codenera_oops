package dec.java.mathclass.pkg;

public class MathClassDemo 
{
	void findPower()
	{
		int num = 5;
		double ans = Math.pow(num, 3);
		System.out.println(ans);
	}
	
	public static void main(String[] args) 
	{
		MathClassDemo m1 = new MathClassDemo();
		m1.findPower();
	}
}
