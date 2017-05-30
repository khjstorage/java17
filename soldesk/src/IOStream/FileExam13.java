package IOStream;

import java.nio.file.*;
import java.io.*;
import java.util.stream.*;

public class FileExam13 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Path  parent = Paths.get(".");
		
		// parent 바로 아래 파일, 디렉토리 목록 구하기
		try(Stream<Path> children = Files.list(parent)){
			children.forEach(path ->{
				System.out.println(path.toAbsolutePath());
			});
		}

	}

}
