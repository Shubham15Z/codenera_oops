/*
 13. Remove Nulls from a List: Given a list containing some null values, filter out all null values using a lambda expression.
 */

package lambdaexpression.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface RemoveNull
{
	public void removeNull(List l1);
}

public class Question13 
{
	public static void main(String[] args)
	{
		List list1 = new ArrayList<>(Arrays.asList(10,null,30,"Java",null,50.3f,"Python",20.4,null,true,200));
		
		System.out.println(list1);
		
		List list2 = new ArrayList();
		
		RemoveNull r1 = (List l1) -> {
			for(Object o1 : l1)
			{
				if(o1 != null)
				{
					list2.add(o1);
				}
			}
		};
		
		r1.removeNull(list1);
		System.out.println(list2);
		
	}
}
