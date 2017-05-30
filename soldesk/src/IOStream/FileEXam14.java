package IOStream;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class FileEXam14 {
	public static void main(String[] args) throws IOException{
		{
			Path path = Paths.get("d:", "example", "test.txt");
			
			byte[] bytes = Files.readAllBytes(path);
			System.out.println(new String(bytes, "utf-8"));
			System.out.println("=============================================");
			
			List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
			for(String line : lines){
				System.out.println(line);
			}
			
			System.out.println("=============================================");
			
			try(Stream<String> lines1 = Files.lines(path, StandardCharsets.UTF_8)){
				lines1.forEach(s -> {
					System.out.println(s);
				});
			}
		}
	}

}









