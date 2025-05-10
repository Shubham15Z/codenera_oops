/*
5. Convert String to Uppercase: Write a lambda expression that takes a string and returns it in uppercase.
 */

package lambdaexpression.pkg;

interface Uppercase
{
	public String convertUppercase(String s1);
}

public class Question5 
{
	public static void main(String[] args) 
	{
		Uppercase u1 = (String s) -> {
			return s.toUpperCase();
		};
		
		String s2 = u1.convertUppercase("HelloJava");
		System.out.println(s2);
	}
	
	
}
