package CollectionClass;

import java.util.*;
import java.util.stream.*;

public class StreamSumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStream stream = IntStream.of(1, 2, 3, 4, 5);
		int total = stream.sum();
		System.out.println("total = "+total);
		
		//jdk8에 추가된 클래스로 객체가 null인지 체크하는 클래스임. 
		// NullPointerException을 쉽게 처리할 수 있게 해준다.
		Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5);
		Optional<Integer> result = stream1.reduce((a, b) -> a*b);	// ((((1*2)*3)*4)*5)
		System.out.println("result = "+result.orElse(-1));
		
		Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5);
		Integer result1 = stream2.reduce(3, (a, b) -> a*b); // (((((3*1)*2)*3)*4)*5)
		
		System.out.println("result1 = "+result1);	
		
	}

}









