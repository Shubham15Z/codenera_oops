/*
 7.Write a Java program to compare two strings using equalignore case.
 */

package dec.java.str.methods;

public class Question7 
{
	void compareString(String s1, String s2)
	{
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		System.out.println(s1.equalsIgnoreCase(s2));
	}
	
	public static void main(String[] args) 
	{
		String s1 = new String("Ajay");
		String s2 = new String("ajay");
		
		String s3 = new String("Ajay");
		String s4 = "Ajay";
		
		String s5 = "Ajay";
		String s6 = "Ajay";
		
		Question7 q7 = new Question7();
		q7.compareString(s1, s2);
		System.out.println("-------------------------");
		q7.compareString(s3, s4);
		System.out.println("-----------------------------");
		q7.compareString(s5, s6);
	}
}
