package IOStream;

import java.nio.file.*;
import java.io.*;
import java.util.stream.*;

public class FileExam13 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Path  parent = Paths.get(".");
		
		// parent �ٷ� �Ʒ� ����, ���丮 ��� ���ϱ�
		try(Stream<Path> children = Files.list(parent)){
			children.forEach(path ->{
				System.out.println(path.toAbsolutePath());
			});
		}

	}

}
