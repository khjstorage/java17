package CollectionClass;

import java.util.*;

public class ListRemoveTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = new ArrayList<String>();
		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.add("X");
		list1.add("D");
		list1.add("Y");
		list1.add("E");
		System.out.println(list1);
		
		List<String> list2 = new ArrayList<String>();
		list2.add("X");
		list2.add("Y");
		
		List<String> list3 = new ArrayList<String>();
		list3.add("A");
		list3.add("E");
		
		System.out.println(list1.remove(2));		// 인덱스에 해당하는 위치의 요소 삭제
		System.out.println(list1);
		
		System.out.println(list1.remove("D"));	// 해당하는 요소 찾아서 삭제
		System.out.println(list1);
		
		System.out.println(list1.removeAll(list2));	// 지정한 컬렉션의 모드 요소를 삭제하고 그결과 리턴
		System.out.println(list1);			// =>[A, B, E]
		
		System.out.println(list1.retainAll(list3));		// 지정한 컬렉션의 모든 요소를 제외한 나머지 요소 삭제
		System.out.println(list1);
		
		list1.clear();   // 모든 요소 삭제
		System.out.println(list1.size());		// 0
		System.out.println(list1.isEmpty());	
		
		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("JavaScript");
		list.add("CSS");
		list.add("HTML");
		
		// 앞 부분이 "J"로 시작하는 요소를 삭제(jdk8부터 사용)
		list.removeIf(s ->s.startsWith("J"));
		System.out.println(list);

	}

}





