package IOStream;

import java.io.*;

public class FileExam9 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File file = File.createTempFile("temp", ".txt");
		System.out.println(file.getAbsolutePath());
		file.deleteOnExit();		// 프로그램이 종료되는 시점에 파일 삭제
		
		File file2 = File.createTempFile("temp", ".txt", new File("d:/example"));
		
		System.out.println(file2.getAbsolutePath());
	}

}
