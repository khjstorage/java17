package CollectionClass;

import java.util.*;

public class SetRemoveTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set1 = new HashSet<String>();
		set1.add("A");
		set1.add("B");
		set1.add("C");
		set1.add("E");
		set1.add("F");
		set1.add("D");
		System.out.println(set1);
		
		Set<String> set2 = new HashSet<String>();
		set2.add("D");
		set2.add("E");
		
		Set<String> set3 = new HashSet<String>();
		set3.add("B");
		set3.add("C");
		
		System.out.println(set1.remove("A"));	//리턴 결과 : true
		System.out.println(set1.remove("G"));	//리턴 결과 : false
		System.out.println(set1);
		
		System.out.println(set1.removeAll(set2));
		System.out.println(set1);
		
		System.out.println(set1.retainAll(set3));
		System.out.println(set1);
		
		set1.clear();
		System.out.println(set1.size());
		System.out.println(set1.isEmpty());
		
		// JDK8버전 이상에서만 사용
		Set<String> set4 = new HashSet<String>();
		set4.add("Java");
		set4.add("JavaScript");
		set4.add("Oracle");
		set4.add("HTML");
		
		set4.removeIf(s -> s.startsWith("J"));
		System.out.println(set4);
	}

}








