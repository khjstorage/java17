package IOStream;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileExam16 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// 파일의 내용을 문자열로 읽기
		try(BufferedReader reader = new BufferedReader(new InputStreamReader(
				new FileInputStream("d:/example/test.txt"), StandardCharsets.UTF_8)))
		{
			String line = null;
			while( (line = reader.readLine()) != null ){
				System.out.println(line);
			}
		}
		
		// 파일에서 읽어들인 내용을 바이트 배열 형태로 읽어서 문자열로 변환
		// BufferedInputStream, FileInputStream, ByteArrayOutputStream class
		BufferedInputStream in = new BufferedInputStream(new FileInputStream("d:/example/test.txt")); 
		byte[] buf = new byte[1024*8];
		int length = 0;
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		
		while( (length = in.read(buf)) != -1 ){
			out.write(buf, 0, length);
		}
		
		System.out.println(out.toString());
		
//		byte[] bytes = out.toByteArray();
//		String str = new String(bytes, StandardCharsets.UTF_8);
//		System.out.println(str);

	}

}









