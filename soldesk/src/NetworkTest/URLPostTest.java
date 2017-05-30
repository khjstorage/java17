package NetworkTest;

import java.io.*;
import java.net.*;
import java.util.*;

public class URLPostTest {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		URL url = new URL("http://www.soldesk.com/");
		
		//HTTP 접속
		HttpURLConnection conn = (HttpURLConnection)url.openConnection();
		//request 메서드를 post로 설정
		conn.setRequestMethod("POST");
		conn.setDoOutput(true);
		
		// 응답 내용 구하기
		try(InputStream in = conn.getInputStream();
				ByteArrayOutputStream out = new ByteArrayOutputStream()){
			byte[] buf = new byte[1024*8];
			int legth = 0;
			while( (legth = in.read(buf)) != -1){
				out.write(buf, 0, legth);
			}
			
			System.out.println(new String(out.toByteArray(), "UTF-8"));
		}
		
		//접속 해제
		conn.disconnect();
	}

}









