package CollectionClass;

import java.util.*;

public class UseVectorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new Vector<String>();
		
		list.add("���");
		list.add("����");
		list.add("��");
		list.add("����");
		
		System.out.println("�߰��� ��� �� : "+list);
		list.add("���");
		System.out.println("�� �߰� �� : "+list);
		System.out.println();
		
		for(String msg :list){
			System.out.println(msg);
		}
		
		list.remove("���");
		System.out.println("���� �� : "+list);
	}

}






