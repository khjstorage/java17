package CollectionClass;

import java.util.*;

public class SetSizeContainsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<String>();
		set.add("A");
		set.add("B");
		set.add("C");
		System.out.println(set);
		
		System.out.println(set.size());
		System.out.println(set.isEmpty());
		
		Set<String> set1 = new HashSet<String>();
		set1.add("A");
		set1.add("B");
		set1.add("C");
		
		Set<String> set2 = new HashSet<String>();
		set2.add("B");
		set2.add("C");
		
		Set<String> set3 = new HashSet<String>();
		set3.add("A");
		set3.add("D");
		
		System.out.println(set1.contains("A"));
		System.out.println(set1.contains("D"));
		
		System.out.println(set1.containsAll(set2));
		System.out.println(set1.containsAll(set3));
	}

}








