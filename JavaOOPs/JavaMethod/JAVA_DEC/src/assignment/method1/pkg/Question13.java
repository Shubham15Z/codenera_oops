/*
Q13. Given two sorted arrays A and B of size p and q, write a Java program to merge elements of A with B by maintaining the sorted order i.e.
 fill A with first p smallest elements and fill B with remaining elements.
 Example:
 Input :
 int[] A = { 1, 5, 6, 7, 8, 10 }
 int[] B = { 2, 4, 9 }
 Output:
 Sorted Arrays:
 A: [1, 2, 4, 5, 6, 7]
 B: [8, 9, 10]
 */

package assignment.method1.pkg;

public class Question13 {
	void mergeSortArray()
	{
		 int[] A = { 1, 5, 6, 7, 8, 10 };
		 int[] B = { 2, 4, 9 };
		 int p = A.length;
		 int q = B.length;
		 
		 for(int i = 0; i < p; i++)
		 {
			 if(A[i] > B[0])
			 {
				 int temp = A[i];
				 A[i] = B[0];
				 B[0] = temp;
				 
				 int first = B[0];
				 int k;
	             for(k = 1; k < q && B[k] < first; k++) 
	             {
	            	 B[k - 1] = B[k];
	             }
	             B[k - 1] = first;
			 }
		 }
		 
		 System.out.println("After sorting elemente in A are :");
		 for(int i = 0; i < p; i++)
		 {
			 System.out.print(A[i]+" ");
		 }
		 System.out.println();
		 System.out.println("After sorting elemente in B are :");
		 for(int i = 0; i < q; i++)
		 {
			 System.out.print(B[i]+" ");
		 }
	}
	
	public static void main(String args[])
	{
		Question13 ob = new Question13();
		ob.mergeSortArray();
	}
}
