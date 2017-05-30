package IOStream;

import java.io.*;

public class FileReadWriteCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fileReader = null;
		BufferedReader bufferReader = null;
		BufferedWriter bufferWriter = null;
		
		try{
			fileReader = new FileReader("d:/example/FileCopyTest.java");
			bufferReader = new BufferedReader(fileReader);
			
			bufferWriter = new BufferedWriter(new FileWriter("d:/example/FileCopyTest.txt", true));
			
			String str = new String();
			
			do{
				str = bufferReader.readLine();
				
				if(str !=null){
					bufferWriter.write(str);
					bufferWriter.newLine();
					System.out.println(str);
				}
			}while(str != null);
		}catch(Exception e){
			System.out.println("오류 : "+e);
		}finally{
			try{
				bufferReader.close();
				bufferWriter.close();
			}catch(Exception er){
				System.out.println("파일 닫기 오류 : "+er);
			}
		}
		
	}

}










