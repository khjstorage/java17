package IOStream;

import java.io.*;

public class FileReadWriteEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		
		File file = new File("d:/example/sample.txt");
		FileReader fr = null;
		FileWriter fw = null;
		InputStreamReader str =null;	// 바이트 기반 스트림을 문자 스트림으로 연결시켜주는 클래스
		
		try{
			str = new InputStreamReader(System.in);
			
			fw = new FileWriter(file, true);
			
			while((i = str.read()) != -1){
				fw.write(i);
			}
			
			fw.flush();
			
			fr = new FileReader(file);
			
			while( (i = fr.read()) != -1 ){
				System.out.print((char)i);
			}
		}catch(IOException ee){
			ee.printStackTrace();
		}finally{
			if(str != null)
				try{
					str.close();
				}catch(IOException e){}
			
			if(fw != null)
				try{
					fw.close();
				}catch(IOException e){}
			
			if(fr != null)
				try{
					fr.close();
				}catch(IOException e){}
		}
	}

}









