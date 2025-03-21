/*
Q14.Wap enter a string and find the occurence of first word, first character, last word, last character in 
string by using class and object.
 */

package dec.java.str.method.assign02.pkg;

import java.util.Scanner;

public class Question14 
{
	private String s1;
	Question14()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		this.s1 = sc.nextLine();	
	}
	
	void findOccurances()
	{
		if(s1.isEmpty())
		{
			System.out.println("String is empty");
			return;
		}
		
		String words[] = s1.split(" ");
		
		char firstChar = s1.charAt(0);
		char lastChar = s1.charAt(s1.length()-1);	
		String firstWord = words[0];
		String lastWord = words[words.length-1];
		
		System.out.println("First Word : "+firstWord);
		System.out.println("First character: " + firstChar);
        System.out.println("Last word: " + lastWord);
        System.out.println("Last character: " + lastChar);
	}
	
	public static void main(String[] args) 
	{
		Question14 q14 = new Question14();
		q14.findOccurances();
	}
}
