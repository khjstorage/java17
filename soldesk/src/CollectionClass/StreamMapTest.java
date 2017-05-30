package CollectionClass;

import java.util.*;
import java.util.stream.*;

public class StreamMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("Java", "Scala", "JavaScript", "Groovy");
		
		list.stream().map(s -> s.length()).forEach(System.out::println);
		System.out.println("Match �޼ҵ� ���� �˾ƺ���");
		// ��� ��Ұ� "J"�� �����ϴ��� ����
		boolean result = list.stream().allMatch(s -> s.startsWith("J")); //->false
		System.out.println(result);
		
		// "J"�� �����ϴ� ��Ұ� 1���� �ִ��� ����
		System.out.println(list.stream().anyMatch(s -> s.startsWith("J"))); //-> true
		
		// "J"�� ���۵Ǵ� ��Ұ� 1���� ������ ����
		System.out.println(list.stream().noneMatch(s -> s.startsWith("J"))); // ->false
		
		List<String> list2 = Arrays.asList("Java,Groovy", "C#,ASP.NET");
		list2.stream().flatMap(s -> Stream.of(s.split(","))).forEach(System.out::println);
	}

}







