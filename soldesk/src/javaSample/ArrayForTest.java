package javaSample;

public class ArrayForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			int[] array = {1, 2, 3};
			
			for(int i=0;i<array.length;i++){
				System.out.println("array[i] : "+array[i]);
			}
			
			for(int value:array){
				System.out.println("value : "+value);
			}
		}
		
		//다차원 배열의 요소를 반복 처리
		{
			int[][] array = {{1, 2, 3},{4, 5, 6}};
			
			// 방법1 : 인덱스를 활용한 출력
			for(int i=0;i<array.length;i++){		//array.length : 행의 갯수
				for(int j=0;j<array[i].length;j++){  //array[i].length : 각 행의 열의 개수
					System.out.println("array[i][j] : "+array[i][j]);	// 결과 : 1 2 3 4 5 6
				}
			}
			
			//방법2 : 확장 for문을 이용하여 출력
			// 첫번째 : array[0] 행의 세 개의 데이타를 가져온다.
			// 두번째 : array[1] 행의 세 개의 데이타를 가져온다.
			for(int[] inArray : array){	
				for(int value : inArray){
					System.out.println("value : "+value);  // 결과 : 1 2 3 4 5 6
				}
			}
		}
	}

}





