package ExceptionTest;

import java.util.Arrays;

public class CloneTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5};
		
		int[] arrClone = arr.clone();
		arrClone[0] = 6;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrClone));
	}

}
