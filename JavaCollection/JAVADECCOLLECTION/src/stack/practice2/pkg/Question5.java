/*
10. Find Next Greater Element  
    - Question: For each element in an array, find the next greater element using a Stack.
    - Input: [2, 5, 1, 3, 4]
    - Output: [5, -1, 3, 4, -1]
 */
package stack.practice2.pkg;

import java.util.Arrays;
import java.util.Stack;

public class Question5
{
	public static void main(String[] args) 
	{
		int[] arr = {2,5,1,3,4};
		
		int[] result = new int[arr.length];
		
		Stack<Integer> st = new Stack<Integer>();
		
		for(int i = arr.length-1; i >= 0 ; i--)
		{
			while(!st.isEmpty() && st.peek() <= arr[i])
			{
				st.pop();
			}
			
			if(st.isEmpty())
			{
				result[i] = -1;
			}
			else
			{
				result[i] = st.peek();
			}
			st.push(arr[i]);
		}
		System.out.println(Arrays.toString(result));
	}
}
