/*
9. Find the Intersection of Two Arrays
- Input: [1, 2, 2, 1] and [2, 2]
- Output: [2, 2]
 */

package com.array.practice.pkg;

public class Question9
{
	public static void main(String[] args) 
	{
		int[] a1 = {1,2,2,1};
		int[] a2 = {2,2};
		
		boolean[] visited = new boolean[a2.length];
		
		for(int i = 0; i < a1.length; i++)
		{
			for(int j = 0; j < a2.length; j++)
			{
				if(a1[i] == a2[j]  && !visited[j])
				{
					System.out.print(a1[i]+" ");
					visited[j] = true;
					break;
				}
			}
		}
	}
}
