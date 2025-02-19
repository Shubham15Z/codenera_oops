/*
Q12.Find the majority element in the array. A majority element in an array A[] of size n is an element that appears more than n/2 times (and hence there is at most one such element).

  Examples :

  Input : {3, 3, 4, 2, 4, 4, 2, 4, 4}
  Output : 4
 */
package assignment.method1.pkg;

public class Question12 {
	void countOccurence()
	{
		int arr[] = {3, 3, 4, 2, 4, 4, 2, 4, 4};
		System.out.println("The majority element is : ");
		for(int i = 0; i < arr.length; i++)
		{
			int count = 1;
			for(int j = i+1; j < arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
					arr[j] = -1;
					count++;
				}
			}
			if(count > arr.length/2)
			{
				if(arr[i] != -1)
				{
					System.out.print(arr[i]);
				}
				break;
			}		
		}
	}
	
	public static void main(String args[])
	{
		Question12 ob = new Question12();
		ob.countOccurence();
	}
}
