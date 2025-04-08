/*
2. Create a thread using the Thread class to count vowels in each word of a sentence using multiple threads  
 */

package dec.java.runnable2.pkg;

class MyThread2 extends Thread
{
	
	private String word;

	public MyThread2(String word) {
		this.word = word;
	}

	public int countThread(String word)
	{
		int count = 0;
		char[] ch1 = word.toCharArray();
		for(int i = 0; i < ch1.length; i++)
		{
			if("aeiou".indexOf(ch1[i]) != -1)
			{
				count++;
			}
		}
		return count;
	}
	
	public void run()
	{
		int vowelCount = countThread(word);
		System.out.println("Word "+word+" , Vowel count is : "+vowelCount);
	}
}

public class Question2 
{
	public static void main(String[] args) 
	{
		String sentence = "This is a java programm";
		
		String[] words = sentence.split(" ");
		
		for(int i = 0; i < words.length; i++)
		{
			MyThread2 t2 = new MyThread2(words[i]);
			t2.start();
		}
	}
}
