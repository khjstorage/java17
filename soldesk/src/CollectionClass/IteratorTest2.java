package CollectionClass;

import java.util.*;

public class IteratorTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String>();
		list.add("First");
		list.add("Second");
		list.add("Third");
		list.add("Fourth");
		
		Iterator<String> itr = list.iterator();
		
		System.out.println("�ݺ��ڸ� �̿��� 1�� ��°� \"Third\" ����");
		
		while(itr.hasNext()){
			String curStr = itr.next();
			System.out.println(curStr);
			
			if(curStr.compareTo("Third")==0)
				itr.remove();
		}
		
		System.out.println("\n\"Third\" ���� �� �ݺ��ڸ� �̿��� 2�� ���");
		itr = list.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}








