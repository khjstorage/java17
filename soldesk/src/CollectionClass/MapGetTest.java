package CollectionClass;

import java.util.*;

public class MapGetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			Map<String, String> map = new HashMap<String, String>();
			map.put("A", "1");
			map.put("B", "2");
			map.put("C", "3");
			
			System.out.println(map.get("A"));
			System.out.println(map.get("B"));
			System.out.println(map.get("C"));
			
			System.out.println("------------------------------");
			
			Collection<String> collection = map.values();
			for(String value : collection){
				System.out.println(value);
			}
		}
		
		{
			Map<String, String> map = new HashMap<String, String>();
			map.put("A", "1");
			
			System.out.println(map.getOrDefault("A", "-"));	// 추출하려는 키가 존재하면 key의 value를 출력
			System.out.println(map.getOrDefault("B", "-"));	// 추출하려는 키가 존재하지 않으면 default값이 출력
		}
		
		{
			Map<String, String> map = new HashMap<String, String>();
			map.put("A", "1");  map.put("B", "2");  map.put("C", "3");  map.put("D", "4");
			
			Set<String> keyset = map.keySet();
			System.out.println(keyset);
		}
	}

}





