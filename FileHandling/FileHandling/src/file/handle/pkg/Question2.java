/*
 Q2.Create a Java program that reads a given text file and performs word counting .
 
 Consider whitespace and punctuation as word separators. 
 
 Your program should display both the total word count and a list of unique words present in the file .
 */


package file.handle.pkg;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Question2
{
	public static void main(String[] args) 
	{
		try 
		{
			File f1 = new File("E:\\Work\\Codenera\\CoreJava\\FileHandling\\files\\file1");
			Scanner sc = new Scanner(f1);
			
			StringBuffer sb = new StringBuffer();
			while(sc.hasNext())
			{
				sb.append(sc.nextLine());
			}
			String s = String.valueOf(sb);
			System.out.println(s);
			
			String[] words = s.split("[\\W]+");
//			System.out.println(Arrays.toString(words));
			
			System.out.println("\nNumber of words in file : "+words.length);
			
			Map<String, Integer> m1 = new HashMap<String, Integer>();
			
			for(String word : words)
			{
				String w = word.toLowerCase();
				m1.put(w, m1.getOrDefault(w, 0)+1);
			}
//			System.out.println(m1);
			
			List<String> l1 = new ArrayList<String>();
			
			for(Map.Entry<String, Integer> entry : m1.entrySet())
			{
				if(entry.getValue() <= 1)
				{
					l1.add(entry.getKey());
				}
			}
			System.out.println("\nunique Word List :");
			System.out.println(l1);
			
			
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		
	}
}
