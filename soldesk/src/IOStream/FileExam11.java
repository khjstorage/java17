package IOStream;

import java.nio.file.*;
import java.io.*;

public class FileExam11 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Path path = Paths.get("src", "IOStream","FileExam11.java");
		
		if(Files.exists(path)){
			System.out.println("경로가 존재합니다.");
		}
		
		if(Files.notExists(path)){
			System.out.println("경로가 존재하지 않습니다.");
		}
		
		if(Files.exists(path, LinkOption.NOFOLLOW_LINKS)){
			System.out.println("경로는 존재합니다.");
		}
		
		Path path2 = Paths.get("d:", "example", "readme.txt");
		Files.delete(path2);
	}

}






