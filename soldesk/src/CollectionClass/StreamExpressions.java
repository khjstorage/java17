package CollectionClass;

import java.util.*;
import java.util.stream.*;

public class StreamExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list = 
				Arrays.asList(new Student("John Smith", 91), new Student("Andy Knight", 93));
		
		Stream<Student> stream = list.stream();
		stream.forEach(s -> {
			String name = s.getName();
			int score = s.getScore();
			System.out.println(name + ":" +score);
		});
	}

}
