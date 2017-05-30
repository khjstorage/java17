package CollectionClass;

import java.util.*;
import java.util.stream.*;

public class StreamMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("Java", "Scala", "JavaScript", "Groovy");
		
		list.stream().map(s -> s.length()).forEach(System.out::println);
		System.out.println("Match 메소드 사용법 알아보기");
		// 모든 요소가 "J"로 시작하는지 조사
		boolean result = list.stream().allMatch(s -> s.startsWith("J")); //->false
		System.out.println(result);
		
		// "J"로 시작하는 요소가 1개라도 있는지 조사
		System.out.println(list.stream().anyMatch(s -> s.startsWith("J"))); //-> true
		
		// "J"로 시작되는 요소가 1개도 없는지 조사
		System.out.println(list.stream().noneMatch(s -> s.startsWith("J"))); // ->false
		
		List<String> list2 = Arrays.asList("Java,Groovy", "C#,ASP.NET");
		list2.stream().flatMap(s -> Stream.of(s.split(","))).forEach(System.out::println);
	}

}







