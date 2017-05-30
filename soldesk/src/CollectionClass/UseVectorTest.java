package CollectionClass;

import java.util.*;

public class UseVectorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new Vector<String>();
		
		list.add("사과");
		list.add("딸기");
		list.add("배");
		list.add("포도");
		
		System.out.println("추가된 요소 값 : "+list);
		list.add("사과");
		System.out.println("값 추가 후 : "+list);
		System.out.println();
		
		for(String msg :list){
			System.out.println(msg);
		}
		
		list.remove("사과");
		System.out.println("삭제 후 : "+list);
	}

}






