package CollectionClass;

import java.util.*;

public class IteratorTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> movie = new HashSet<String>();
		
		movie.add("대부");
		movie.add("반지의 제왕");
		movie.add("겨울왕국");
		movie.add("다크 나이트");
		movie.add("해리포터");
		movie.add("공공의 적");
		
		Iterator<String> itr = movie.iterator();
		
		while(itr.hasNext()){
			String s = itr.next();
			System.out.println(s);
		}
	}

}







