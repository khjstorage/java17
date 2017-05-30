package CollectionClass;

import java.util.*;

public class MapEntrySetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<String, String>();
		map.put("A", "1"); map.put("B", "2"); map.put("C", "3"); map.put("D", "4");
		
		Set<Map.Entry<String, String>> set = map.entrySet();
		for(Map.Entry<String, String> entry : set){
			System.out.println(entry.getKey()+ ", "+ entry.getValue());
		}
		
		System.out.println(set);
		//람다식으로 키와 값을 처리하기
		map.forEach((key, value) -> System.out.println(key + ", "+ value));
		
		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);

		items.forEach((k,v)->{
			System.out.println("Item : " + k + " Count : " + v);
			if("E".equals(k)){
				System.out.println("Hello E");
			}
		});
	}

}






