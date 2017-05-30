package IOStream;

import java.io.*;

public class FileReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fileReader = null;
		
		try{
			fileReader = new FileReader("d:/example/streamTest.txt");
			
			int i = 0;
			while(i !=-1){
				i = fileReader.read();
				System.out.print((char)i);
			}
		}catch(IOException e){
			System.out.println("����:"+e);
		}finally{
			try{
				fileReader.close();
			}catch(Exception er){
				System.out.println("���� �ݱ� ����:"+er);
			}
		}
	}

}








