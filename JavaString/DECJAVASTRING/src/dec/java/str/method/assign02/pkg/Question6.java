/*
Q6.Wap enter a string and print first non repeating character using class and object.
 */

package dec.java.str.method.assign02.pkg;

import java.util.Scanner;

public class Question6 
{
	void printNonRepChar(String s1)
	{
		char[] c1 = s1.toCharArray();
		
		for(int i = 0; i < c1.length; i++)
		{
			int count = 0; 
			for(int j = 0; j < c1.length; j++)
			{
				if(c1[i] == c1[j])
					count++;
			}
			if(count == 1)
			{
				System.out.println(c1[i]);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s1 = sc.nextLine();
		
		Question6 q6 = new Question6();
		q6.printNonRepChar(s1);
		
	}
}
