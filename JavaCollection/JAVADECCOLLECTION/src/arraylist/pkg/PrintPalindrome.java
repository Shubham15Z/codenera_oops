/*
//Wap to print all the palindrome elements from the ArrayList
        ArrayList<Integer> list = new ArrayList(Arrays.asList(121,11,30,444,567,609));
 */


package arraylist.pkg;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintPalindrome 
{
	public static void printPalindrome(ArrayList<Integer> l1)
	{
		for (int i = 0; i < l1.size(); i++) 
		{
			int num = l1.get(i);
			int rev = 0;
			for(int j = num; j > 0; j=j/10)
			{
				int digit = j % 10;
				rev = rev*10 + digit ;
			}
			if(rev == num)
			{
				System.out.print(rev+" ");
			}
		}
	}
	
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList(Arrays.asList(121,11,30,444,567,609));
		printPalindrome(list);
	}
}
