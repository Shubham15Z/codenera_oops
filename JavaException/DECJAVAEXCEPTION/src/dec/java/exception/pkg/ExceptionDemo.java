package dec.java.exception.pkg;

public class ExceptionDemo 
{
	public static void main(String[] args) 
	{
		String s1 = "HelloJava";
		int[] arr = {6,4,6,2,3};
		
		System.out.println(50);
		System.out.println(100);
		System.out.println(150);
		System.out.println(200);
		try 
		{
//			System.out.println(s1.charAt(12));
//			System.out.println(arr[9]);
			System.out.println(Integer.parseInt("893ud"));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

		System.out.println(300);
		System.out.println(350);
		System.out.println(400);
		System.out.println(450);
		System.out.println(500);
	}
}
