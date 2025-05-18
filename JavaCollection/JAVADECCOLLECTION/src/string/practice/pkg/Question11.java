/*
Q11. Twice Counter
Input:
N = 3
list = {Geeks, For, Geeks}
Output: 1
Explanation: 'Geeks' is the only word that
appears twice.
 */

package string.practice.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Question11 
{
	public static int countTwiceCounter(String[] words, int N)
	{
		HashMap<String, Integer> m1 = new HashMap<String, Integer>();
		
		for(int i = 0; i < N; i++)
		{
			m1.put(words[i], m1.getOrDefault(words[i], 0)+1);
		}
		
		int count = 0;
		for(int freq : m1.values())
		{
			if(freq == 2)
				count++;
		}
		return count;
	}
	public static void main(String[] args) 
	{
		int N = 3;
        String[] list = {"Geeks", "For", "Geeks"};
		System.out.println(countTwiceCounter(list,N));
	}
}
