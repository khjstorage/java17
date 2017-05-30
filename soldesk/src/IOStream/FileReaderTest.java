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
			System.out.println("오류:"+e);
		}finally{
			try{
				fileReader.close();
			}catch(Exception er){
				System.out.println("파일 닫기 오류:"+er);
			}
		}
	}

}








