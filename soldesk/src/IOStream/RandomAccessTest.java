package IOStream;

import java.io.IOException;
import java.io.RandomAccessFile;

/*
 * 텍스트형식의 파일을 읽고 화면에 뿌린 후 읽은 곳까지의 포인터 위치를 저장한 후
 * 파일을 닫고 다시 연후 좀 전에 저장한 포인터 위치부터 읽어서 화면에 뿌리는 프로그램
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








