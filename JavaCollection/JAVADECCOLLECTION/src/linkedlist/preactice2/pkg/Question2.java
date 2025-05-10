/*
2. 
Reverse the LinkedList all elements 
 */

package linkedlist.preactice2.pkg;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Question2 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> list = new LinkedList(Arrays.asList(121,111,132,34,54));
		Collections.reverse(list);
		System.out.println(list);
	}
}
