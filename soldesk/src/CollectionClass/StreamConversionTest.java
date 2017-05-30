package CollectionClass;

import java.util.*;
import java.util.stream.*;

public class StreamConversionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("Java", "Scala", "JavaScript","Groovy");
		
		List<String> result1 = list.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(result1);
		
		Set<String> result2 = list.stream().map(s -> s.toUpperCase()).collect(Collectors.toSet());
		System.out.println(result2);
		
		List<String> result3 = list.stream().map(s -> s.toUpperCase())
				.collect(Collectors.toCollection(LinkedList::new));
		System.out.println(result3);
		
//		Map<String, Integer> map = list.stream()
//				.collect(Collectors.toMap(s -> s, 
//						s -> s.length()));
		Map<Integer, String> map = list.stream()
				.collect(Collectors.toMap(s -> s.length(), 
						s -> s));
		System.out.println(map);
		
		//Stream을 배열로 변환하기
		System.out.println("Stream을 배열로 변환하기");
//		Object[] result4 = list.stream().map(s -> s.toUpperCase()).toArray();
		String[] result4 = list.stream().map(s -> s.toUpperCase())
				.toArray(String[]::new);
		
		
		System.out.println(Arrays.toString(result4));
	}

}








