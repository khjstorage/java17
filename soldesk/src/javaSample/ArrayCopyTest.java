package javaSample;

import java.util.Arrays;
import java.awt.*;

public class ArrayCopyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//기본 데이타 유형 배열 복사
		{
			int[] array = {30, 10, 20, 15};
			
			int[] sameArray = Arrays.copyOf(array, array.length);	 	//=>{30, 10, 20, 15}
			int[] shortArray = Arrays.copyOf(array, 2);              	//=>{30, 10}
			int[] longArray = Arrays.copyOf(array, 6);				 	//=>{30, 10, 20, 15, 0, 0}
			int[] rangArray = Arrays.copyOfRange(array, 1, 3);	 	//=>{10, 20}; 
			int[] longRangArray = Arrays.copyOfRange(array, 2, 5);	//=>{20, 15, 0};
		}
		
		// copyof 메소드를 이용한 얕은 복사의 예
		{
			Point[] srcPoint = {new Point(10, 20), new Point(30, 40)};
			Point[] destPoint = Arrays.copyOf(srcPoint, 2);
			
			srcPoint[0].x = 50;
			
			System.out.println("srcPoint[0].x : "+srcPoint[0].x);		// 출력결과 : 50
			System.out.println("destPoint[0].x : "+destPoint[0].x);	// 출력결과 : 50
		}
		
		System.out.println("-------- 참조 복사 ------------");
		
		//참조처의 오브젝트를 복사하는 깊은 복사의 예
		{
			Point[] srcPoint = {new Point(10,20), new Point(30,40)};
			int size = srcPoint.length;
			
			Point[] destPoint = new Point[size];
			
			for(int i=0;i<size;i++){
				destPoint[i] = new Point(srcPoint[i].x, srcPoint[i].y);
			}
			
//			System.out.println("destPoint[0].x : "+destPoint[0].x);
//			System.out.println("destPoint[0].y : "+destPoint[0].y);
			
			// srcPoint의 배열 내의 오브젝트의 멤버변수 값을 변경해본다.
			srcPoint[0].x = 50;
			System.out.println("srcPoint[0].x : "+srcPoint[0].x);
			System.out.println("destPoint[0].x : "+destPoint[0].x);
		}
	}

}








