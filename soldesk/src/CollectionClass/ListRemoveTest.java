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
		
		System.out.println(list1.remove(2));		// �ε����� �ش��ϴ� ��ġ�� ��� ����
		System.out.println(list1);
		
		System.out.println(list1.remove("D"));	// �ش��ϴ� ��� ã�Ƽ� ����
		System.out.println(list1);
		
		System.out.println(list1.removeAll(list2));	// ������ �÷����� ��� ��Ҹ� �����ϰ� �װ�� ����
		System.out.println(list1);			// =>[A, B, E]
		
		System.out.println(list1.retainAll(list3));		// ������ �÷����� ��� ��Ҹ� ������ ������ ��� ����
		System.out.println(list1);
		
		list1.clear();   // ��� ��� ����
		System.out.println(list1.size());		// 0
		System.out.println(list1.isEmpty());	
		
		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("JavaScript");
		list.add("CSS");
		list.add("HTML");
		
		// �� �κ��� "J"�� �����ϴ� ��Ҹ� ����(jdk8���� ���)
		list.removeIf(s ->s.startsWith("J"));
		System.out.println(list);

	}

}





