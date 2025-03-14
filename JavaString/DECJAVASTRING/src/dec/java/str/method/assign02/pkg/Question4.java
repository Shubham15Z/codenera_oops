/*
Q4.Wap enter a string and sort each word of string in accending and decending order by the length of each word.
 */

package dec.java.str.method.assign02.pkg;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Question4 
{
	void sortWordsAscending(String s1)
	{
		String[] words = s1.trim().split("\\s+");
		
		Arrays.sort(words, Comparator.comparingInt(String::length));
		
		System.out.println(Arrays.toString(words));
	}
	
	void sort2(String s1)
	{
		String[] words = s1.trim().split("\\s+");
		for(int i = 0; i < words.length; i++)
		{
			for(int j = i+1; j < words.length; j++)
			{
				if(words[i].length() > words[j].length())
				{
					String temp = words[i];
					words[i] = words[j];
					words[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(words));
	}
	
	void sortWordsDescending(String s1)
	{
		String[] words = s1.trim().split("\\s+");
		for(int i = 0; i < words.length; i++)
		{
			for(int j = i+1; j < words.length; j++)
			{
				if(words[i].length() < words[j].length())
				{
					String temp = words[i];
					words[i] = words[j];
					words[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(words));
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s1 = sc.nextLine();
		
		Question4 q4 = new Question4();
//		q4.sortWordsAscending(s1);
		q4.sort2(s1);
		q4.sortWordsDescending(s1);
		
	}
}
