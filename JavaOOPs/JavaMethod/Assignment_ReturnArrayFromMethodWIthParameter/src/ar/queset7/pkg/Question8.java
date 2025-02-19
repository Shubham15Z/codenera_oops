package ar.queset7.pkg;

public class Question8 {
	void rearrangeElements(int arr[])
	{
		int left = 0, right = arr.length-1;
		while(left < right)
		{
			while(left < arr.length && arr[left] < 0)
			{
				left++;
			}
			while(right >= 0 && arr[right] > 0)
			{
				right--;
			}
			if(left < right)
			{
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
		}
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) 
	{
		int arr[] = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
		Question8 ob = new Question8();
		ob.rearrangeElements(arr);
		
	}
}
