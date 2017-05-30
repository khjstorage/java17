package IOStream;

import java.io.*;
import java.nio.file.*;

public class FileCreateExam {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		// File->Path로 변환
		{
			File file = new File("d:/example/test.txt");
			Path path = file.toPath();
			System.out.println(path);
		}
		//Path를 File로 변환
		{
			Path path = Paths.get("test.txt");
			File file = path.toFile();
			System.out.println(file);
		}
		//File을 사용한 파일 조작
		{
			File dir = new File("d:/example/dir");
			dir.mkdir();
			
			File file = new File(dir, "test.txt");
			file.createNewFile();
			
			file.delete();
			dir.delete();
		}
		//nio 패키지를 활용하여 파일 조작
		{
			Path dir = Paths.get("d:/example/dir2");
			Files.createDirectory(dir);
			
			Path file = dir.resolve("test2.txt");
			Files.createFile(file);
			
			Files.delete(file);
			Files.delete(dir);			
		}
	}

}







