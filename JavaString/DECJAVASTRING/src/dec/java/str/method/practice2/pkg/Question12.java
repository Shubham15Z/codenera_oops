/*
12. Extract numbers from a string using split() and find their average. 
 */


package dec.java.str.method.practice2.pkg;

public class Question12 
{
	String numbers = "10,20,30,40,50";
	
	void splitWord()
	{
		String[] s1 =  numbers.split(",");
		int sum = 0;
		double avg = 0;
		for(int i = 0; i < s1.length; i++)
		{
			sum = sum +Integer.parseInt(s1[i]);
		}
		
		avg = (sum/s1.length);
		
		System.out.println("Average of numbers is : "+avg);

	}
	public static void main(String[] args)
	{
		Question12 q12 = new Question12();
		q12.splitWord();
	}
}
