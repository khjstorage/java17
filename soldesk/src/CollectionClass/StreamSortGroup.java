package CollectionClass;

import java.util.*;
import java.util.stream.*;

public class StreamSortGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<String> list =new ArrayList<String>();
//		list.add("Java");
//		list.add("Scala");
		List<String> list = Arrays.asList("Java", "Scala", "JavaScript","Groovy");
		
		list.stream().sorted().forEach(System.out::println);
		list.stream().sorted((a, b) ->a.length()-b.length())
			.forEach(System.out::println);
		
		System.out.println("----- ±×·ìÈ­ -------");
		/*
		 * "J", "Java, JavaScript"
		 * "S", "Scala"
		 * "G", "Groovy"
		 */
		Map<Character, List<String>> map = list.stream()
				.collect(Collectors.groupingBy(s -> s.charAt(0)));
		
		System.out.println(map.get('J'));
		System.out.println(map.get('S'));
		System.out.println(map.get('G'));
		System.out.println(map);
	}

}









