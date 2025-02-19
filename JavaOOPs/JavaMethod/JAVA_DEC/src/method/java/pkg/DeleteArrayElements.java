package method.java.pkg;

public class DeleteArrayElements {
	public static void main(String args[]) {
		DeleteArrayElements ob = new DeleteArrayElements();
		ob.deleteDuplicate();
	}
	
	void deleteDuplicate() {
		int a[] = {2,4,6,3,9,1,3,8,2,0,4};
		System.out.println("The array elements are : ");
		for(int i = 0; i <a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
		for(int i = 0; i < a.length; i++) {
			for(int j = i+1; j < a.length; j++) {
				if(a[i] == a[j]) {
					a[j] = -1;
				}
			}
		}
		
		System.out.println();
		System.out.println("The array after deleting duplicate elements : ");
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] != -1)
			{
				System.out.print(a[i]+" ");
			}
		}
	} 
}
