package javaSample;

import java.util.*;

public class ArrayDeepEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			int[][] intArray1 = {{1, 2, 3}, {4, 5, 6}};
			int[][] intArray2 = {{1, 2, 3}, {4, 5, 6}};
			
			System.out.println(Arrays.deepEquals(intArray1, intArray2));		// 내용 비교 : true
			System.out.println(Arrays.equals(intArray1, intArray2));			// 위치 비교 : false
		}
		
		{
			int[] array = {1, 5, 2, 4, 3};
			Arrays.parallelSort(array);
			System.out.println(Arrays.toString(array));		// =>[1, 2, 3, 4, 5]
		}
	}

}





