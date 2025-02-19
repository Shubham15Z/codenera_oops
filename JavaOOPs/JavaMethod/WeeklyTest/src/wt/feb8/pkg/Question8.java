/*
Q8.Given a sorted array with possibly duplicate elements. The task is to find indexes of first and last occurrences of an 
element X in the given array.
Note: If the element is not present in the array return {-1,-1} as pair.
Example 1:

Input:
N = 9
v[] = {1, 3, 5, 5, 5, 5, 67, 123, 125}
X = 5
Output:
2 5
Explanation:
Index of first occurrence of 5 is 2
and index of last occurrence of 5 is 5.
 */

package wt.feb8.pkg;

public class Question8 {
	
	void findOccurence(int v[])
	{
		int x = 5;
		int first = -1, last = -1;

		for(int i = 0; i < v.length; i++)
		{
			if(v[i] == x)
			{
				if(first == -1)
				{
					first = i;
				}
				last = i;
			}
		}
		System.out.print(first+", "+last);
	}
	public static void main(String[] args) {
		Question8 ob = new Question8(); 
		int v[] = {1, 3, 5, 5, 5, 5, 67, 123, 125};
		System.out.println("The pair of index is : ");
		ob.findOccurence(v);
	}
}
