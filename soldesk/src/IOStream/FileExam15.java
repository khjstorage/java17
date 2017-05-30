package IOStream;

import java.io.*;
import java.nio.charset.*;

public class FileExam15 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedInputStream in = new BufferedInputStream(new FileInputStream("d:/example/test.txt"));
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		
		byte[] buf = new byte[1024*8];
		int length =0;
		
		while( (length= in.read(buf)) != -1 ){
			out.write(buf, 0, length);
		}
		
		byte[] bytes = out.toByteArray();
		System.out.println(new String(bytes, StandardCharsets.UTF_8));
	}

}












