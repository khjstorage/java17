package javaSample;

import java.util.ArrayList;
import java.util.List;

public class SungJuk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(new Student("������", 3, 2, 90, 80, 90));
		list.add(new Student("���ڹ�", 3, 1, 100, 85, 70));
		list.add(new Student("ŷ��¯", 3, 3, 75, 80, 90));
		list.add(new Student("ȫ�浿", 1, 2, 90, 40, 90));
		list.add(new Student("�ְ��", 1, 1, 90, 80, 90));
		list.add(new Student("��浿", 1, 3, 90, 80, 85));
		list.add(new Student("�̿뱸", 2, 4, 90, 80, 90));
		list.add(new Student("�̿���", 2, 1, 100, 80, 65));
		list.add(new Student("�ڿ���", 2, 2, 76, 80, 90));
		list.add(new Student("������", 1, 4, 90, 67, 80));
		
		printList(list);
	}
	
	public static void printList(List<Student> list){
		System.out.println("�̸�\t\t��\t��ȣ\t����\t����\t����\t����  ");
		System.out.println("==========================================================");
		
		for(Student s : list){
			System.out.println(s);
		}
		
		System.out.println("=========================================================");
	}

}






