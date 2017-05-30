package CollectionClass;

import java.util.*;

public class ArraysTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 0, 4, 5, 7, 2, 8, 6, 9, 3};
		
		System.out.println("------Arrays.toString()--------");
		System.out.println(array);
		System.out.println(Arrays.toString(array));
		System.out.println();
		
		System.out.println("------Arrays.sort()--------");
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		System.out.println();
		
		System.out.println("------Arrays.binarySearch()--------");
		System.out.println(Arrays.binarySearch(array, 6));
		System.out.println(Arrays.binarySearch(array, 10));
		System.out.println();
		
		System.out.println("------Arrays.fill()--------");
		Arrays.fill(array, 0);
		System.out.println(Arrays.toString(array));
		Arrays.fill(array, 1);
		System.out.println(Arrays.toString(array));
	}

}







