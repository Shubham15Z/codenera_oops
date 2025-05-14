/*
1. Wap create a file and add any sentence in it,
   now from that file , find out :
   
       1)no of words started with vowel
       2)frequency of charcater
       3)most repeated words
 */

package file.handle.pkg;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Question1 
{
	public static int numberWithVowels(String s)
	{
		String[] str = s.split(" ");
		int count = 0;
		System.out.println("Words starts with vowels");
		for(int i = 0; i < str.length; i++)
		{
			char ch = Character.toLowerCase(str[i].charAt(0));
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			{
				System.out.print(str[i]+" ");
				count++;
			}
		}
		return count;
	}
	
	public static void frequencyCharacter(String s)
	{
		String[] str = s.split(" ");
		
		Map<Character, Integer> frequency = new HashMap<Character, Integer>();
		
		for(String word : str)
		{
			for(int i = 0; i < word.length(); i++)
			{
				char ch = word.charAt(i);
				frequency.put(ch, frequency.getOrDefault(ch, 0)+1);
			}
		}
		
		System.out.println("2. Character Frequency\n"+frequency);
	}
	
	public static void mostRepeatedWords(String s)
	{
		String[] words = s.split(" ");
		Map<String, Integer> repeated = new HashMap<String, Integer>();
		
		for (String word : words) 
		{
	        word = word.toLowerCase();
	        repeated.put(word, repeated.getOrDefault(word, 0) + 1);
	    }
		
		String mostRepeated = "";
		int maxCount = 0;
		
		for (Map.Entry<String, Integer> entry : repeated.entrySet())
		{
	        if (entry.getValue() > maxCount)
	        {
	            maxCount = entry.getValue();
	            mostRepeated = entry.getKey();
	        }
	    }
		
		System.out.println("3. Most Repeated : "+mostRepeated);
		
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a file name to create new file...");
		String f_name = sc.next();
		sc.nextLine();
	
		try 
		{
			File que1 = new File("E:\\Work\\Codenera\\CoreJava\\FileHandling\\files\\"+f_name);
			que1.createNewFile();
			System.out.println(f_name+" file created successfully..");
			
			System.out.println("\nEnter a file name to write data : ");
			String file_name = sc.next();
			sc.nextLine();
			
			FileWriter fw = new FileWriter("E:\\Work\\Codenera\\CoreJava\\FileHandling\\files\\"+file_name);
			System.out.println("Enter a sentence ...");
			String str = sc.nextLine();
			fw.write(str);
			fw.close();
			System.out.println("Content added successfully....");
			sc.nextLine();
			
			File f1 = new File("E:\\Work\\Codenera\\CoreJava\\FileHandling\\files\\"+file_name);
			Scanner sc1 = new Scanner(f1);
			
			StringBuffer sb = new StringBuffer();
			while(sc1.hasNext())
			{
				sb.append(sc1.nextLine());
			}
			String s = String.valueOf(sb);
			
			String[] words = s.split(" ");
			
			int num = numberWithVowels(s);
			System.out.println("\n1. Number of words with vowels are : "+num);
			
			frequencyCharacter(s);
			mostRepeatedWords(s);
			
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
