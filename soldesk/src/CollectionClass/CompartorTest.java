package CollectionClass;

import java.util.*;

public class CompartorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArr = {"cat", "Dog", "lion", "tiger"};
		
		Arrays.sort(strArr);
		System.out.println("strArr= "+Arrays.toString(strArr));
		
		// 대소문자 구별없이 정렬
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER );
		System.out.println("strArr= "+Arrays.toString(strArr));
		
		Arrays.sort(strArr, new Descending());
		System.out.println("strArr= "+Arrays.toString(strArr));
	}

}






