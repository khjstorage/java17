package IOStream;

import java.io.*;

public class FileInputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream input = null;
		
		try{
			File file = new File("d:\\example\\streamTest.txt");
			
			input = new FileInputStream(file);
			int i =0;
			
			while( (i=input.read()) !=-1 ){
				char c = (char)i;
				System.out.print(c);
			}
		}catch(IOException e){
			System.out.println(e);
		}finally{
			try{
				input.close();
			}catch(IOException ex){}
		}
	}

}








