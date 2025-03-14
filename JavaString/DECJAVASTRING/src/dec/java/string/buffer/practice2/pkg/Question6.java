/*
6. Write a Java class that accepts a sentence, splits it into words, and stores each word in an array, 
then reconstructs the sentence using StringBuilder.
 */

package dec.java.string.buffer.practice2.pkg;

import java.util.Arrays;
import java.util.Scanner;

public class Question6 
{	
	void sentencePrint(String s1)
	{
		String[] words = s1.trim().split("\\s+");
		System.out.println("words in array :");
		System.out.println(Arrays.toString(words));
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < words.length; i++)
		{
			sb.append(words[i]+" ");
		}
		System.out.println("Reconstructing sentence : ");
		System.out.println(sb);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence :");
		String s1 = sc.nextLine();
		
		Question6 q6 = new Question6();
		q6.sentencePrint(s1);
	}
}
