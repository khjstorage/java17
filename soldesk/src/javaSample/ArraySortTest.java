package javaSample;

import java.util.Arrays;

public class ArraySortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�迭�� �����ϴ� ���
		{
			//�迭 array�� ������������ ����
			String[] array = {"apple", "strawberry", "blueberry", "oragne"};
			Arrays.sort(array);
			System.out.println(Arrays.toString(array));		//=>{apple, blueberry, orange, strawberry}
			
			//�迭 arrayRange�� �ε��� 1���� 3�̸��� ������ �������� ����
			int[] arrayRange = {1, 5, 2, 4, 3};
			Arrays.sort(arrayRange, 1, 3);
			System.out.println(Arrays.toString(arrayRange)); //==>{1, 2, 5, 4, 3}
		}
		
		// ���ڿ� ���̷� �迭�� ����
		{
			String[] array = {"apple", "strawberry", "blueberry", "oragne"};
			Arrays.sort(array, new StringLengthComparator());
			System.out.println("���ڿ� ���̷� ������ ��� : "+Arrays.toString(array));  
			//=>{apple, orange, blueberry, strawberry}
		}

	}

}








