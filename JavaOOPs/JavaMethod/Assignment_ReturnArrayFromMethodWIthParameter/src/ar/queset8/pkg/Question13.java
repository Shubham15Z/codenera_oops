package ar.queset8.pkg;

public class Question13 
{
	void sortAndMerge(int A[], int B[])
	{
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
		 
		 System.out.println("After sorting elements in A are :");
		 for(int i = 0; i < p; i++)
		 {
			 System.out.print(A[i]+" ");
		 }
		 System.out.println();
		 System.out.println("After sorting elements in B are :");
		 for(int i = 0; i < q; i++)
		 {
			 System.out.print(B[i]+" ");
		 }

	}
	public static void main(String[] args) 
	{
		 int[] A = { 1, 5, 6, 7, 8, 10 };
		 int[] B = { 2, 4, 9 };
		 Question13 ob = new Question13();
		 ob.sortAndMerge(A, B);
	}
}
