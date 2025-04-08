/*
5. Create a thread using the Thread class to find all palindromic substrings in a string concurrently.
 */

package dec.java.runnable2.pkg;

class MyThread5 extends Thread
{
	private String input;
	
	public MyThread5(String input)
	{
		this.input = input;
	}
	
	public void findPalindormeString()
	{
		int n = input.length();
		System.out.println("Palindromic substring are :");
		
		for(int i = 0; i < n; i++)
		{
			for(int j = i+1; j <= n; j++)
			{
				String sub = input.substring(i,j);
				if(isPalindrome(sub))
				{
					System.out.println(sub);
				}
			}
		}
	}
	
	public boolean isPalindrome(String sub)
	{
		int left = 0;
		int right = sub.length()-1;
		
		while(left < right)
		{
			if(sub.charAt(left) != sub.charAt(right))
			{
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	
	public void run()
	{
		findPalindormeString();
	}
	
}
public class Question5 
{
	public static void main(String[] args) 
	{
		String input = "abaca";
		
		MyThread5 t5 = new MyThread5(input);
		t5.start();
	}
}
