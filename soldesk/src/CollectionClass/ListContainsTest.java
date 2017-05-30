package CollectionClass;

import java.util.*;

public class ListContainsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = new ArrayList<String>();
		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.add("B");
		
		List<String> list2 = new ArrayList<String>();
		list2.add("A");
		list2.add("B");
		
		List<String> list3 = new ArrayList<String>();
		list3.add("A");
		list3.add("D");
		
		System.out.println(list1.contains("A"));
		System.out.println(list1.contains("D"));
		
		System.out.println(list1.containsAll(list2));
		System.out.println(list1.containsAll(list3));
		
		System.out.println(list1.indexOf("C"));
		System.out.println(list1.indexOf("E"));
		
		System.out.println(list1.lastIndexOf("B"));
		System.out.println(list1.lastIndexOf("E"));
	}

}









