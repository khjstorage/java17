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
		
		//������ �迭�� ��Ҹ� �ݺ� ó��
		{
			int[][] array = {{1, 2, 3},{4, 5, 6}};
			
			// ���1 : �ε����� Ȱ���� ���
			for(int i=0;i<array.length;i++){		//array.length : ���� ����
				for(int j=0;j<array[i].length;j++){  //array[i].length : �� ���� ���� ����
					System.out.println("array[i][j] : "+array[i][j]);	// ��� : 1 2 3 4 5 6
				}
			}
			
			//���2 : Ȯ�� for���� �̿��Ͽ� ���
			// ù��° : array[0] ���� �� ���� ����Ÿ�� �����´�.
			// �ι�° : array[1] ���� �� ���� ����Ÿ�� �����´�.
			for(int[] inArray : array){	
				for(int value : inArray){
					System.out.println("value : "+value);  // ��� : 1 2 3 4 5 6
				}
			}
		}
	}

}





