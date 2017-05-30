package CollectionClass;

import java.util.*;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("A", "1");
		hashMap.put("C", "3");
		hashMap.put("E", "5");
		hashMap.put("D", "4");
		hashMap.put("B", "2");
		System.out.println(hashMap);
		
		Map<String, String> linkedHashMap = new LinkedHashMap<String, String>();
		linkedHashMap.put("A", "1");
		linkedHashMap.put("C", "3");
		linkedHashMap.put("E", "5");
		linkedHashMap.put("D", "4");
		linkedHashMap.put("B", "2");
		System.out.println(linkedHashMap);
		
		Map<String, String> treeMap = new TreeMap<String, String>();
		treeMap.put("A", "1");
		treeMap.put("C", "3");
		treeMap.put("E", "5");
		treeMap.put("D", "4");
		treeMap.put("B", "2");
		System.out.println(treeMap);
	}

}





