package CollectionClass;

import java.util.*;

import javaSample.StringLengthComparator;

public class ListSortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("strawberry");
		list.add("blueberry");
		list.add("orange");
		
		// 오름차순으로 정렬
		Collections.sort(list);	//=>[apple, blueberry, orange, strawberry]
		System.out.println(list);
		
		//내림차순으로 정렬
		Collections.reverse(list);	//=>[strawberry, orange, blueberry, apple]
		System.out.println(list);
		
		List<String> list1 = new ArrayList<String>();
		list1.add("apple");
		list1.add("strawberry");
		list1.add("blueberry");
		list1.add("orange");
		
		// 자체정렬 기능 사용하기
		Collections.sort(list1, new StringLengthComparator());  // 문자열의 길이별 정렬
		System.out.println(list1);
	}

}







