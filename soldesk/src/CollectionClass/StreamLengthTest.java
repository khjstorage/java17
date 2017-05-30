package CollectionClass;

import java.util.*;
import java.util.stream.*;

public class StreamLengthTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("Java", "JavaScript", "ASP.NET", "Oracle");
		Stream<String> stream1 = list.stream();
		long count = stream1.count();
		System.out.println(count);
		
//		IntStream stream2 = IntStream.iterate(0, i -> i+1);  //무한 데이타가 만들어짐.
//		long count2 = stream2.count();
//		System.out.println(count2);
		
		List<String> list2 = Arrays.asList("Java", "JavaScript", "Java", "Oracle");
		long count1 = list2.stream().distinct().count(); // 3
		System.out.println(count1);
		
		System.out.println("요소의 값 출력");
		list2.stream().forEach(s -> System.out.println(s));
		System.out.println("=============================");
		list2.stream().forEach(System.out::println);
	}

}







