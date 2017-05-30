package javaSample;

import java.util.Arrays;

public class ArraySortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열을 정렬하는 기능
		{
			//배열 array를 오름차순으로 정렬
			String[] array = {"apple", "strawberry", "blueberry", "oragne"};
			Arrays.sort(array);
			System.out.println(Arrays.toString(array));		//=>{apple, blueberry, orange, strawberry}
			
			//배열 arrayRange를 인덱스 1에서 3미만의 범위로 오름차순 정렬
			int[] arrayRange = {1, 5, 2, 4, 3};
			Arrays.sort(arrayRange, 1, 3);
			System.out.println(Arrays.toString(arrayRange)); //==>{1, 2, 5, 4, 3}
		}
		
		// 문자열 길이로 배열을 정렬
		{
			String[] array = {"apple", "strawberry", "blueberry", "oragne"};
			Arrays.sort(array, new StringLengthComparator());
			System.out.println("문자열 길이로 정렬한 결과 : "+Arrays.toString(array));  
			//=>{apple, orange, blueberry, strawberry}
		}

	}

}








