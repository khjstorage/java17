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
		System.out.println(list.get(1));	// ������ �ε��� ��ġ�� ����Ÿ ���
		
		list.set(1, "X"); 	// �ε��� ��ġ�� ����Ÿ�� �����ϴ� ��
		System.out.println(list);
		
		list.replaceAll(s -> s.toLowerCase());  // ��� ��Ұ����� �ҹ��ڷ� ����
		System.out.println(list);
	}

}






