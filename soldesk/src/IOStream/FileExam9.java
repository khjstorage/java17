package IOStream;

import java.io.*;

public class FileExam9 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File file = File.createTempFile("temp", ".txt");
		System.out.println(file.getAbsolutePath());
		file.deleteOnExit();		// ���α׷��� ����Ǵ� ������ ���� ����
		
		File file2 = File.createTempFile("temp", ".txt", new File("d:/example"));
		
		System.out.println(file2.getAbsolutePath());
	}

}
