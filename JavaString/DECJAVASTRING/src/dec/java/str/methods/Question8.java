/*
 8.Wap enter a string and the character present at even and odd position individually.
 */
package dec.java.str.methods;

import java.util.Scanner;

public class Question8
{
	void printOddEvenChar(String s1)
	{
		char ch [] = s1.toCharArray();
		String evenChars = "";
		String oddChars = "";
		for(int i = 0; i < ch.length; i++)
		{
			
			if(i%2 == 0)
			{
				evenChars = evenChars+ch[i]+" ";
			}
			else
			{
				oddChars = oddChars+ch[i]+" ";
			}
		}
		
		System.out.println("Even postion characters elements in String :"+evenChars);
		System.out.println("Odd postion characters elements in String :"+oddChars);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String :");
		String s1 = sc.nextLine();
		
		Question8 q8 = new Question8();
		q8.printOddEvenChar(s1);
	}
}
