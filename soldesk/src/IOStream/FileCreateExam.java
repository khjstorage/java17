package IOStream;

import java.io.*;
import java.nio.file.*;

public class FileCreateExam {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		// File->Path�� ��ȯ
		{
			File file = new File("d:/example/test.txt");
			Path path = file.toPath();
			System.out.println(path);
		}
		//Path�� File�� ��ȯ
		{
			Path path = Paths.get("test.txt");
			File file = path.toFile();
			System.out.println(file);
		}
		//File�� ����� ���� ����
		{
			File dir = new File("d:/example/dir");
			dir.mkdir();
			
			File file = new File(dir, "test.txt");
			file.createNewFile();
			
			file.delete();
			dir.delete();
		}
		//nio ��Ű���� Ȱ���Ͽ� ���� ����
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







