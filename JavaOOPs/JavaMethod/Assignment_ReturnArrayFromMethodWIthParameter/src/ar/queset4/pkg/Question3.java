/*
Q3.Write a Java program to find the sum of the two elements of a given array which is equal to a given integer.
   Sample array: [1,2,4,5,6]
   Target value: 6. 
 */

package ar.queset4.pkg;

public class Question3 {
	
	 int sumElementPair(int a[])
	 {
		 int target = 6;
		 
		 System.out.println("The pair is : ");
	  	 for(int i = 0; i < a.length; i++)
		 {
	  		int ele = 0;
	  		 for(int j = i+1; j < a.length; j++)
			 {
				if(a[i]+a[j] == target)
				{
					System.out.print(a[i]+" ");
					ele = a[j];
				}
			 }
	  		 return ele;
		 }
	  	 return 0;
	 }
		
	public static void main(String args[])
	{
		int a[] = {1,2,4,5,6};
		Question3 ob = new Question3();
		int result = ob.sumElementPair(a);
		System.out.println(result);
	}
	
}
