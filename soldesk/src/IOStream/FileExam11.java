package IOStream;

import java.nio.file.*;
import java.io.*;

public class FileExam11 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Path path = Paths.get("src", "IOStream","FileExam11.java");
		
		if(Files.exists(path)){
			System.out.println("��ΰ� �����մϴ�.");
		}
		
		if(Files.notExists(path)){
			System.out.println("��ΰ� �������� �ʽ��ϴ�.");
		}
		
		if(Files.exists(path, LinkOption.NOFOLLOW_LINKS)){
			System.out.println("��δ� �����մϴ�.");
		}
		
		Path path2 = Paths.get("d:", "example", "readme.txt");
		Files.delete(path2);
	}

}






