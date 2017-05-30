package CollectionClass;

import java.util.*;

public class ListGetSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		
		System.out.println(list);
		System.out.println(list.get(1));	// 지정된 인덱스 위치의 데이타 출력
		
		list.set(1, "X"); 	// 인덱스 위치의 데이타를 변경하는 것
		System.out.println(list);
		
		list.replaceAll(s -> s.toLowerCase());  // 모든 요소값들은 소문자로 변경
		System.out.println(list);
	}

}






