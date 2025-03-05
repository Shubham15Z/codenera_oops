package dec.java.str.methods;

public class StringMethods 
{
	
	public static void printString()
	{
		String s = "I am Invincible";
		
		String s1 = "  And Great  ";
		
		String s2 = "This is Amravati, it is good place and Amravati is too far";
		
		String n = "I am";
		
//		PRINT STRING CHARACTERS
//		for(int i = 0; i < s.length(); i++)
//		{
//			System.out.print(s.charAt(i)+",");
//		}
		
//		CONCAT TWO STRING
//		String s3 = s.concat(s1);
//		System.out.println(s);
//		System.out.println(s3);
		
//		LOWERCASE
//		String s4 = s.toLowerCase();
//		System.out.println(s);
//		System.out.println(s4);
		
//		UPPERCASE
//		String s5 = s.toUpperCase();
//		System.out.println(s);
//		System.out.println(s5);
		
//		TRIM
//		String s6 = s1.trim();
//		System.out.println(s1);
//		System.out.println(s6);
		
//		SUBSTRING
//		System.out.println(s.substring(5));
//		System.out.println(s.substring(5,9));
		
//		REPLACE
//		String s7 = s2.replace("Amravati", "Pune");
//		System.out.println(s2);
//		System.out.println(s7);
		
//		STARTSWITH
//		System.out.println(s.startsWith(n));
//		System.out.println(s.startsWith("I"));
//		System.out.println(s.startsWith("i"));
		
//		ENDSWITH
		System.out.println(s.endsWith(n));
		System.out.println(s.endsWith("e"));
	}
	public static void main(String[] args) 
	{
		printString();
		
	}
}
