/*
Q3.Wap input a string and print only those word which first character is vowel.
 */

package dec.java.str.method.assign02.pkg;

import java.util.Scanner;

public class Question3 
{
	void printWords(String s1)
	{
		String[] words = s1.trim().split("\\s+");
		
		for(int i = 0; i < words.length; i++)
		{
			char firstChar = Character.toLowerCase(words[i].charAt(0));
			if(firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u')
				System.out.println(words[i]);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s1 = sc.nextLine();
		
		Question3 q3 = new Question3();
		q3.printWords(s1);
		
	}
}
