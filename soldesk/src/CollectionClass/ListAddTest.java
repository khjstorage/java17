package CollectionClass;

import java.util.*;

public class ListAddTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		
		System.out.println(list);
		
		// [A, B, C]의 인덱스 2번째에 요소 삽입
		list.add(2, "Z");  	//=>[A, B, Z, C]
		System.out.println(list);
		
		//List의 앞에 요소 추가
		list.add(0,"X");
		System.out.println(list); 	//=>[X, A, B, Z, C]
		
		List<String> list1 = new ArrayList<String>();
		list1.add("A");
		list1.add("B");
		list1.add("C");
		
		List<String> list2 = new ArrayList<String>();
		list2.add("X");
		list2.add("Y");
		
		list1.addAll(list2);
		System.out.println(list1);
		
		list1.addAll(2, list2);		// [A, B, C, X, Y]의 인덱스 2번째에 [X, Y] 추가
		System.out.println(list1);
	}

}









