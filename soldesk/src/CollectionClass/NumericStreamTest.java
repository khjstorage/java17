package CollectionClass;

import java.util.stream.*;

public class NumericStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//IntStream�� ����
		IntStream intStream1 = IntStream.of(1, 2, 3);
		
		// �迭�κ��� IntStream�� ����
		int[] array = {1, 2 ,3};
		IntStream intStream2 = IntStream.of(array);
		
		// 1���� 9���� ���� ���� �� �ִ� IntStream�� ����
		IntStream intStream3 = IntStream.range(1, 10);
		
		// 1���� 10���� ���� ���� �� �ִ� IntStream�� ����
		IntStream intStream4 = IntStream.rangeClosed(1, 10);
		
		
		Stream<String> stream = Stream.of("Java", "JavaScript", "Oracle", "Spring");
		IntStream intStream = stream.mapToInt(s -> s.length());
		
		intStream.forEach(System.out::println);
	}

}









