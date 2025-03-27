package dec.java.mathclass.pkg;

public class LogDemo
{
	public static void main(String[] args) {
		int n = 153;
		int digits = (int)Math.log10(n)+1;
		System.out.println(digits);
		int sum = 0;
		
//		for(int i = n; i > 0; i=i/10)
//		{
//			int rem = i % 10;
//			sum = sum + (int) Math.pow(rem,digits);
//		}
		
		for(int i = n; i > 0; i=i/10)
		{
			int rem = i % 10;
			sum = sum + rem*rem*rem;
		}
		
		if(sum == n)
		{
			System.out.println("This is armstrong number");
		}
		else
		{
			System.out.println("This is not Armstrong number");
		}
	}
}
