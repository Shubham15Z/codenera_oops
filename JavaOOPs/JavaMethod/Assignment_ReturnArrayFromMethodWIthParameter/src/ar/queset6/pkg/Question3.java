package ar.queset6.pkg;

public class Question3 
{
	int equilibriumPoinnt(int A[])
	{
		for(int i = 0; i < A.length; i++)
		{
			int lsum = 0, rsum = 0;
			for(int j = 0; j < i; j++)
			{
				lsum += A[j];
			}

			for(int j = i+1; j < A.length; j++)
			{
				rsum += A[j];
			}

			if(lsum == rsum)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) 
	{
		int A[] = {1,3,5,2,2};
		Question3 ob = new Question3();
		int index = ob.equilibriumPoinnt(A);
		System.out.println("The Equilibrium element index is : "+index);
	}
}
