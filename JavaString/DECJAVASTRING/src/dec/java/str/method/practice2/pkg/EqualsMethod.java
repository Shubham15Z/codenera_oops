package dec.java.str.method.practice2.pkg;

public class EqualsMethod 
{
	public static void main(String[] args) 
	{
		String s1 = "Ajay";
		String s2 = "Ajay";
		
		String s3 = new String("Ajay");
		String s4 = new String("Ajay");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		System.out.println("-------------------");
		System.out.println(s3.equals(s4));
		System.out.println(s3==s4);
		System.out.println("-------------------");
		System.out.println(s1.equals(s4));
		System.out.println(s1==s4);
	}
}
