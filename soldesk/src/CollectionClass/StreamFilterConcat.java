package CollectionClass;

import java.util.*;
import java.util.stream.*;

public class StreamFilterConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("Java", "Oracle", "JavaScript", "Groovy");
		
		list.stream()
			.filter(s -> s.startsWith("J"))
			.forEach(System.out::println);
		
		Stream<String> s1 = Stream.of("Java", "Groovy");
		Stream<String> s2 = Stream.of("Scale", "Croud");
		
		Stream<String> s3 = Stream.concat(s1, s2);
		
		s3.forEach(System.out::println);
	}

}








