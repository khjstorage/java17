package CollectionClass;

import java.util.*;

public class UseListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List al = new ArrayList();
		
		al.add(10);
		al.add("�ȳ��ϼ���.");
		
		System.out.println("ũ�� : "+al.size()+" / "+al);
		
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
		}
		
		//����
		al.remove(1);
		System.out.println("���� �� ũ�� : "+al.size()+" / "+al);
		
		al.clear();
		System.out.println("clear �� ũ�� : "+al.size()+" / "+al);
		
		List<String> list = new ArrayList<String>();
		list.add("������");
		list.add("ȭ����");
		list.add("�Դϴ�.");
		
		System.out.println("ũ�� : "+list.size()+" / "+list);
		list.add("5���� ��°��");
		System.out.println("ũ�� : "+list.size()+" / "+list);
		
		for(String msg : list){
			System.out.println(msg);
		}
		
		String[] msg = new String[list.size()];
		list.toArray(msg);
		
		//���� : �ε����� ����
		list.remove(1);
		System.out.println("�ε����� 1�� ���� �� : "+ list);
		
		// ���� : ��Ұ����� ����
		list.remove("�Դϴ�.");
		System.out.println("��Ұ����� ���� �� : "+list);
		
		//��� ��� ����
		list.clear();
		System.out.println("��� ��� ���� �� : "+list);
		
		list.add("soldesk");
		System.out.println("ũ�� : "+list.size()+" / "+list);
	}

}









