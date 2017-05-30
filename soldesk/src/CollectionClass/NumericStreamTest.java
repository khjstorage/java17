package CollectionClass;

import java.util.stream.*;

public class NumericStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//IntStream을 생성
		IntStream intStream1 = IntStream.of(1, 2, 3);
		
		// 배열로부터 IntStream을 생성
		int[] array = {1, 2 ,3};
		IntStream intStream2 = IntStream.of(array);
		
		// 1부터 9까지 값을 담을 수 있는 IntStream을 생성
		IntStream intStream3 = IntStream.range(1, 10);
		
		// 1부터 10까지 값을 담을 수 있는 IntStream을 생성
		IntStream intStream4 = IntStream.rangeClosed(1, 10);
		
		
		Stream<String> stream = Stream.of("Java", "JavaScript", "Oracle", "Spring");
		IntStream intStream = stream.mapToInt(s -> s.length());
		
		intStream.forEach(System.out::println);
	}

}









