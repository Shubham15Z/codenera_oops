/*
Q8 Keypad typing (Microsoft)
Input:
S =     geeksforgeeks
Output: 4335736743357
Explanation:geeksforgeeks is 4335736743357
in decimal when we type it using the given
keypad.
 */

package string.practice.pkg;

public class Question8 
{
	
	public static String getKeypadSequence(char ch)
	{
		ch = Character.toLowerCase(ch);
		
		if("abc".indexOf(ch) != -1) return "2";
		if("def".indexOf(ch) != -1) return "3";
		if("ghi".indexOf(ch) != -1) return "4";
		if("jkl".indexOf(ch) != -1) return "5";
		if("mno".indexOf(ch) != -1) return "6";
		if("pqrs".indexOf(ch) != -1) return "7";
		if("tuv".indexOf(ch) != -1) return "8";
		if("wxyz".indexOf(ch) != -1) return "9";
		return "";
	}
	public static String convertToKeypad(String input)
	{
		StringBuilder result = new StringBuilder();
		
		for(char ch : input.toCharArray())
		{
			result.append(getKeypadSequence(ch));
		}
		
		return result.toString();
	}
	
	public static void main(String[] args) 
	{
		String input = "geeksforgeeks";
		
		String output = convertToKeypad(input);
		
		System.out.println(input);
		System.out.println(output);
	}
}
