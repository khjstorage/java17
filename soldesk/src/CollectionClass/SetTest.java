package CollectionClass;

import java.util.*;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			// Set을 이용한 컬렉션 클래스들의 객체 생성 방법들
			Set<String> set = new HashSet<String>();
			Set<String> set1 = new HashSet<>(); 
			Set<String> set2 = new HashSet<>(100);
		}
		
		{
			Set<String> hashSet = new HashSet<>();
			hashSet.add("A");
			hashSet.add("C");
			hashSet.add("E");
			hashSet.add("D");
			hashSet.add("B");
			
			System.out.println(hashSet);
			
			Set<String> linkedHashSet = new LinkedHashSet<>();
			linkedHashSet.add("A");
			linkedHashSet.add("C");
			linkedHashSet.add("E");
			linkedHashSet.add("D");
			linkedHashSet.add("B");
			System.out.println(linkedHashSet);
			
			Set<String> treeSet = new TreeSet<String>();
			treeSet.add("A");
			treeSet.add("C");
			treeSet.add("E");
			treeSet.add("D");
			treeSet.add("B");
			System.out.println(treeSet);
		}

	}

}






