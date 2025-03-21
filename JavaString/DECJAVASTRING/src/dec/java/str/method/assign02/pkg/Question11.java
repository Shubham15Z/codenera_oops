/*
Q11.Wap enter a string and find the percentage of uppercase, lowercase, digits and special characters in a string.
 */

package dec.java.str.method.assign02.pkg;

import java.util.Scanner;

public class Question11 
{
	private String s1;
	Question11()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		this.s1 = sc.nextLine();
		
	}
	
	void findPercentage()
	{
		double length = s1.length();
		double upperCaseCount = 0, lowerCaseCount = 0, digitCount = 0, specialCharCount = 0;
		for(int i = 0; i < s1.length(); i++)
		{
			if(s1.charAt(i) >= 'A' && s1.charAt(i) <= 'Z')
				upperCaseCount++;
			else if(s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z')
				lowerCaseCount++;
			else if(s1.charAt(i) >= '0' && s1.charAt(i) <= '9')
				digitCount++;
			else
				specialCharCount++;
		}
		
		System.out.println("Percentage of Uppercase : "+((upperCaseCount/length)*100));
		System.out.println("Percentage of Lowercae : "+((lowerCaseCount/length)*100));
		System.out.println("Percentage of Digit : "+((digitCount/length)*100));
		System.out.println("Percentage of Special Character : "+((specialCharCount/length)*100));
	}
	
	public static void main(String[] args) 
	{
		Question11 q11 = new Question11();
		q11.findPercentage();
	}
}
