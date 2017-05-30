package IOStream;

import java.io.IOException;
import java.io.RandomAccessFile;

/*
 * �ؽ�Ʈ������ ������ �а� ȭ�鿡 �Ѹ� �� ���� �������� ������ ��ġ�� ������ ��
 * ������ �ݰ� �ٽ� ���� �� ���� ������ ������ ��ġ���� �о ȭ�鿡 �Ѹ��� ���α׷�
 */
public class RandomAccessTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomAccessFile rf;
		long pos = 0;
		
		try{
			rf = new RandomAccessFile("d:/example/test.log", "r");
			pos = readLines(rf);
			rf.close();
			
			System.out.println("\nread 1-10\n\n");
			rf = new RandomAccessFile("d:/example/test.log", "r");
			rf.seek(pos);
			pos = readLines(rf);
		}catch(Exception e){
			System.out.println(e.toString());
		}
	}
	
	private static long readLines(RandomAccessFile rf) throws IOException{
		long recnum = 1;
		String temp;
		
		while( (temp = rf.readLine()) != null ){
			System.out.println("Line "+recnum+ " : "+temp);
			if( ((++recnum)%10) ==0 )
			{
				break;
			}
		}
		
		return rf.getFilePointer();
	}

}








