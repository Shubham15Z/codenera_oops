/*
10. Find Next Greater Element  
    - Question: For each element in an array, find the next greater element using a Stack.
    - Input: [2, 5, 1, 3, 4]
    - Output: [5, -1, 3, 4, -1]
 */

package col.imp.que.pkg;

import java.util.Arrays;
import java.util.Stack;

public class Question10 
{
	public static void main(String[] args) 
	{
		int[] arr = {2,5,1,3,4};
		int n = arr.length;
		
		Stack<Integer> st = new Stack<Integer>();
		
		Integer[] res = new Integer[n];
		
		for(int i = n-1; i >= 0; i--)
		{
			while(!st.isEmpty() && st.peek() <= arr[i])
			{
				st.pop();
			}
				
			res[i] = st.isEmpty() ? -1 : st.peek();
			
			st.push(arr[i]);
		}
		
		System.out.println(Arrays.toString(res));
		
	}
}
