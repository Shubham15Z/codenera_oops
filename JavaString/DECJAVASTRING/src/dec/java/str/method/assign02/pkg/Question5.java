/*
Q5.Wap enter a string in lowercase now you have to convert every first character of the word in upper case.
 */

package dec.java.str.method.assign02.pkg;

import java.util.Scanner;

public class Question5 
{
	void convertFirstUppercase(String s1)
	{
		String[] words = s1.trim().split("\\s+");
		
		String result = "";
		
		for(int i = 0; i < words.length; i++)
		{
			if(!words[i].isEmpty())
			{
				char firstChar = Character.toUpperCase(words[i].charAt(0));
				String remaining = words[i].substring(1);
				result += firstChar+remaining+" ";
			}
		}
		
		System.out.println(result.trim());
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s1 = sc.nextLine();
		
		Question5 q5 = new Question5();
		q5.convertFirstUppercase(s1);
		
	}
}
