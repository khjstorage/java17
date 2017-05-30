package IOStream;

import java.io.*;

public class FileCopyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream input = null;
		FileOutputStream output = null;
		
		try{
			File file = new File("d:\\example\\streamTest.txt");
			
			input = new FileInputStream(file);
			
			output = new FileOutputStream(new File("d:\\example\\streamTest_copy.txt"));
			
			int readBuffer = 0;
			byte[] buffer = new byte[512];
			
			while( (readBuffer = input.read(buffer)) != -1 ){
				output.write(buffer, 0, readBuffer);
			}
			System.out.println("파일이 복사되었습니다.");
		}catch(IOException e){
			System.out.println(e);
		}finally{
			try{
				input.close();
				output.close();
			}catch(IOException io){}
		}
	}

}









