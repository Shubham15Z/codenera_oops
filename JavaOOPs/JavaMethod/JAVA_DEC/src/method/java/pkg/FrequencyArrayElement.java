package method.java.pkg;

public class FrequencyArrayElement {

		public static void main(String args[])
		{
			FrequencyArrayElement ob = new FrequencyArrayElement();
			ob.frequencyArrayElements();
		}
		
		void frequencyArrayElements()
		{
			int a [] = {10,30,40,20,10,30,50,10,40,60,10};
			System.out.println("The array elements are : ");
			for(int i = 0; i < a.length; i++)
			{
				System.out.print(a[i]+" ");
			}
			
			System.out.println();
			for(int i = 0; i <a.length; i++)
			{
				int count = 1;
				for(int j = i+1; j < a.length; j++)
				{
					if(a[i] == a[j])
					{
						count++;
						a[j] = -1;
					}
				}
				if(a[i] != -1)
				{
					System.out.println("The frequency of element "+a[i]+" is :"+count);
				}	
				
			}
		}
}
