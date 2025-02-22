/*
 Q8.Given three arrays sorted in non-decreasing order, print all common elements in these arrays.

Examples: 

 Input: 
ar1[] = {1, 5, 10, 20, 40, 80} 
ar2[] = {6, 7, 20, 80, 100} 
ar3[] = {3, 4, 15, 20, 30, 70, 80, 120} 
Output: 20, 80
 */

package dec.arraypractice.pkg;


class CommonElement
{
	void printCommonElement(int [] ar1, int [] ar2, int [] ar3)
	{
		for(int i = 0; i < ar1.length; i++)
		{
			for(int j = 0; j < ar2.length; j++)
			{
				for(int k = 0; k < ar3.length; k++)
				{
					if(ar1[i] == ar2[j] && ar1[i] == ar3[k])
					{
						System.out.println(ar3[k]);
					}
				}
			}
		}
	}
}
public class Question1 
{
	public static void main(String[] args) {
		int ar1[] = {1, 5, 10, 20, 40, 80}; 
		int ar2[] = {6, 7, 20, 80, 100}; 
		int ar3[] = {3, 4, 15, 20, 30, 70, 80, 120}; 
		CommonElement c1 = new CommonElement();
		c1.printCommonElement(ar1, ar2, ar3);
	}
}
