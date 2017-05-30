package NetworkTest;

import java.io.*;
import java.net.*;
import java.util.*;

public class URLPostTest {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		URL url = new URL("http://www.soldesk.com/");
		
		//HTTP ����
		HttpURLConnection conn = (HttpURLConnection)url.openConnection();
		//request �޼��带 post�� ����
		conn.setRequestMethod("POST");
		conn.setDoOutput(true);
		
		// ���� ���� ���ϱ�
		try(InputStream in = conn.getInputStream();
				ByteArrayOutputStream out = new ByteArrayOutputStream()){
			byte[] buf = new byte[1024*8];
			int legth = 0;
			while( (legth = in.read(buf)) != -1){
				out.write(buf, 0, legth);
			}
			
			System.out.println(new String(out.toByteArray(), "UTF-8"));
		}
		
		//���� ����
		conn.disconnect();
	}

}









