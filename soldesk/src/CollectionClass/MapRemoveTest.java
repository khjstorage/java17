package CollectionClass;

import java.util.*;

public class MapRemoveTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<String, String>();
		map.put("A", "1"); map.put("B", "2"); map.put("C", "3");
		
		String removed = map.remove("C");
		System.out.println("removed : "+removed);
		System.out.println(map);
		
		map.clear();
		System.out.println(map);
		
		Map<String, String> map1 = new HashMap<String, String>();
		map1.put("A", "1"); map1.put("B", "2"); map1.put("C", "3");
		
		System.out.println(map1.size());
		System.out.println(map1.isEmpty());
		
		System.out.println("key를 포함하고 있는지 확인 : "+map1.containsKey("A"));
		System.out.println("key를 포함하고 있는지 확인 : "+map1.containsKey("1"));
		
		System.out.println("값을 포함하고 있는지 확인 : "+map1.containsValue("1"));
	}

}





