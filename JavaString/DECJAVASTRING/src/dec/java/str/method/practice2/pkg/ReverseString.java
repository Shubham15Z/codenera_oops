package dec.java.str.method.practice2.pkg;

public class ReverseString 
{
	String s1 = "I am fine";
	String rev = "";
	String[] s2 = s1.split(" ");
	
	void reverseString1()
	{
		for(int i = s2.length-1; i >= 0; i--)
		{
			rev = rev+s2[i]+" ";
		}
		System.out.println(rev.trim());
	}
	
	void reverseString2()
	{
		for(int i = s1.length()-1; i >= 0; i--)
		{
			rev = rev+s1.charAt(i);
		}
		System.out.println(rev);
	}
	
	void reverseString3()
	{
		for(int i = 0; i < s2.length; i++)
		{
			String s3 = s2[i];
			for(int j = s3.length()-1; j>=0; j--)
			{
				System.out.print(s3.charAt(j));
			}
			System.out.print(" ");
		}

	}
	
	
	public static void main(String[] args) {
		ReverseString r1 = new ReverseString();
		
//		r1.reverseString1();
//		r1.reverseString2();
		r1.reverseString3();
	}
}
