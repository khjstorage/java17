package IOStream;

import java.nio.file.*;
import java.io.*;

public class FileExam12 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		// 파일명 변경
		{
			Path from = Paths.get("d:", "example", "sample.txt");
			Path to = Paths.get("d:", "example","fuga.txt");
			
			Files.move(from, to);
		}
		//파일 복사
		{
			Path from = Paths.get("d:", "example", "randomtest.txt");
			Path to = Paths.get("d:", "example", "fuga1.txt");
			Files.copy(from, to);
			Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
		}
		
		{
			InputStream in = new FileInputStream("d:/example/link1.txt");
			Path path = Paths.get("d:/example/fuga2.txt");
			long size = Files.copy(in, path);
			System.out.println(size+"바이트를 복사했습니다.");
		}
	}

}








