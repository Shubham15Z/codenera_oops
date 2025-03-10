package dec.java.str.method.practice2.pkg;

public class SplitMethod 
{
	public static void main(String[] args) {
		String s1 = "I am a Batman I will save you";
		System.out.println(s1);
		
		String[] s2 = s1.split(" ");
		
		for(int i = 0; i < s2.length; i++)
		{
			System.out.print(s2[i]+"   ");
		}
	}
}
