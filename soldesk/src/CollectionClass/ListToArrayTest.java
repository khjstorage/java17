package CollectionClass;

import java.util.*;

public class ListToArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			List<String> list = new ArrayList<String>();
			list.add("A");
			list.add("B");
			list.add("C");
			
			String[] array = list.toArray(new String[list.size()]);
			System.out.println(Arrays.toString(array));
		}
		
		{
			String[] array = {"A", "B", "C", "D"};
			List<String> list = Arrays.asList(array);
			System.out.println(list);
		}
		
		{
			List<String> list = Arrays.asList("apple", "orange", "kiwi");
			System.out.println(list);
		}
	}

}









