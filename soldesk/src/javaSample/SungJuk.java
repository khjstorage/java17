package javaSample;

import java.util.ArrayList;
import java.util.List;

public class SungJuk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(new Student("전지현", 3, 2, 90, 80, 90));
		list.add(new Student("왕자바", 3, 1, 100, 85, 70));
		list.add(new Student("킹왕짱", 3, 3, 75, 80, 90));
		list.add(new Student("홍길동", 1, 2, 90, 40, 90));
		list.add(new Student("최고수", 1, 1, 90, 80, 90));
		list.add(new Student("김길동", 1, 3, 90, 80, 85));
		list.add(new Student("이용구", 2, 4, 90, 80, 90));
		list.add(new Student("이원구", 2, 1, 100, 80, 65));
		list.add(new Student("박원구", 2, 2, 76, 80, 90));
		list.add(new Student("정원구", 1, 4, 90, 67, 80));
		
		printList(list);
	}
	
	public static void printList(List<Student> list){
		System.out.println("이름\t\t반\t번호\t국어\t수학\t영어\t총점  ");
		System.out.println("==========================================================");
		
		for(Student s : list){
			System.out.println(s);
		}
		
		System.out.println("=========================================================");
	}

}






