package IOStream;

import java.io.IOException;
import java.nio.file.*;

public class FileExam10 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Path path1 = Paths.get("temp", "test.txt");
		Path parent1 = path1.getParent();
		System.out.println(parent1);
		
		Path path2 = Paths.get("c:", "temp", "test.txt"); // c:/temp/test.txt
		Path root1 = path2.getRoot();
		System.out.println(root1);
		
		Path path3 = Paths.get("d:", "example", "sample.txt");
		Path link = Paths.get("d:", "example", "link1.txt");
		
		Files.createLink(link, path3);
	}

}








