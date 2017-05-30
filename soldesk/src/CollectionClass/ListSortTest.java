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
		
		// ������������ ����
		Collections.sort(list);	//=>[apple, blueberry, orange, strawberry]
		System.out.println(list);
		
		//������������ ����
		Collections.reverse(list);	//=>[strawberry, orange, blueberry, apple]
		System.out.println(list);
		
		List<String> list1 = new ArrayList<String>();
		list1.add("apple");
		list1.add("strawberry");
		list1.add("blueberry");
		list1.add("orange");
		
		// ��ü���� ��� ����ϱ�
		Collections.sort(list1, new StringLengthComparator());  // ���ڿ��� ���̺� ����
		System.out.println(list1);
	}

}







