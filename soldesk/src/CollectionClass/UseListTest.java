package CollectionClass;

import java.util.*;

public class UseListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List al = new ArrayList();
		
		al.add(10);
		al.add("안녕하세요.");
		
		System.out.println("크기 : "+al.size()+" / "+al);
		
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
		}
		
		//삭제
		al.remove(1);
		System.out.println("삭제 후 크기 : "+al.size()+" / "+al);
		
		al.clear();
		System.out.println("clear 후 크기 : "+al.size()+" / "+al);
		
		List<String> list = new ArrayList<String>();
		list.add("오늘은");
		list.add("화요일");
		list.add("입니다.");
		
		System.out.println("크기 : "+list.size()+" / "+list);
		list.add("5월의 둘째주");
		System.out.println("크기 : "+list.size()+" / "+list);
		
		for(String msg : list){
			System.out.println(msg);
		}
		
		String[] msg = new String[list.size()];
		list.toArray(msg);
		
		//삭제 : 인덱스로 삭제
		list.remove(1);
		System.out.println("인덱스로 1방 삭제 후 : "+ list);
		
		// 삭제 : 요소값으로 삭제
		list.remove("입니다.");
		System.out.println("요소값으로 삭제 후 : "+list);
		
		//모든 요소 삭제
		list.clear();
		System.out.println("모든 요소 삭제 후 : "+list);
		
		list.add("soldesk");
		System.out.println("크기 : "+list.size()+" / "+list);
	}

}









