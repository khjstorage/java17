package javaSample;

import java.util.Arrays;
import java.awt.*;

public class ArrayCopyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�⺻ ����Ÿ ���� �迭 ����
		{
			int[] array = {30, 10, 20, 15};
			
			int[] sameArray = Arrays.copyOf(array, array.length);	 	//=>{30, 10, 20, 15}
			int[] shortArray = Arrays.copyOf(array, 2);              	//=>{30, 10}
			int[] longArray = Arrays.copyOf(array, 6);				 	//=>{30, 10, 20, 15, 0, 0}
			int[] rangArray = Arrays.copyOfRange(array, 1, 3);	 	//=>{10, 20}; 
			int[] longRangArray = Arrays.copyOfRange(array, 2, 5);	//=>{20, 15, 0};
		}
		
		// copyof �޼ҵ带 �̿��� ���� ������ ��
		{
			Point[] srcPoint = {new Point(10, 20), new Point(30, 40)};
			Point[] destPoint = Arrays.copyOf(srcPoint, 2);
			
			srcPoint[0].x = 50;
			
			System.out.println("srcPoint[0].x : "+srcPoint[0].x);		// ��°�� : 50
			System.out.println("destPoint[0].x : "+destPoint[0].x);	// ��°�� : 50
		}
		
		System.out.println("-------- ���� ���� ------------");
		
		//����ó�� ������Ʈ�� �����ϴ� ���� ������ ��
		{
			Point[] srcPoint = {new Point(10,20), new Point(30,40)};
			int size = srcPoint.length;
			
			Point[] destPoint = new Point[size];
			
			for(int i=0;i<size;i++){
				destPoint[i] = new Point(srcPoint[i].x, srcPoint[i].y);
			}
			
//			System.out.println("destPoint[0].x : "+destPoint[0].x);
//			System.out.println("destPoint[0].y : "+destPoint[0].y);
			
			// srcPoint�� �迭 ���� ������Ʈ�� ������� ���� �����غ���.
			srcPoint[0].x = 50;
			System.out.println("srcPoint[0].x : "+srcPoint[0].x);
			System.out.println("destPoint[0].x : "+destPoint[0].x);
		}
	}

}








