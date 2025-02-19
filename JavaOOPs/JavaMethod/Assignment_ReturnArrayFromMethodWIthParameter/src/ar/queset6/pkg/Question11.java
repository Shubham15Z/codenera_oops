package ar.queset6.pkg;

public class Question11 {
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
		Question11 ob = new Question11(); 
		int v[] = {1, 3, 5, 5, 5, 5, 67, 123, 125};
		System.out.println("The pair of index is : ");
		ob.findOccurence(v);
	}
}
