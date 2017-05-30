package CollectionClass;

import java.util.*;

public class ListForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		
		for(String value : list){
			System.out.println("("+value+")");
		}
		
		list.forEach(s -> System.out.println("["+ s +"]"));  	// =>[A] [B] [C]
		
		System.out.println(list.size());
		System.out.println(list.isEmpty());
	}

}











