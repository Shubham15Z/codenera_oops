/*
1. Create a thread using the Thread class to reverse every word in a string independently 
 */


package dec.java.runnable2.pkg;

class MyThread1 extends Thread
{
	public void reverseWord()
	{
		String s1 = "Hello world java is simple";
		
		String[] words = s1.split(" ");
		
		StringBuilder reverse = new StringBuilder();
		
		for(int i = 0; i < words.length; i++)
		{
			StringBuilder sb = new StringBuilder(words[i]);
			
			reverse.append(sb.reverse().toString()).append(" ");
		}
		
		System.out.println(reverse.toString().trim());
	}
	
	public void run()
	{
		reverseWord();
	}
}

public class Question1 
{
	public static void main(String[] args) 
	{
		MyThread1 t1 = new MyThread1();
		t1.start();
	}
}
