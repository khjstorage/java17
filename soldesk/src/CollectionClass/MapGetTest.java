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
			
			System.out.println(map.getOrDefault("A", "-"));	// �����Ϸ��� Ű�� �����ϸ� key�� value�� ���
			System.out.println(map.getOrDefault("B", "-"));	// �����Ϸ��� Ű�� �������� ������ default���� ���
		}
		
		{
			Map<String, String> map = new HashMap<String, String>();
			map.put("A", "1");  map.put("B", "2");  map.put("C", "3");  map.put("D", "4");
			
			Set<String> keyset = map.keySet();
			System.out.println(keyset);
		}
	}

}





