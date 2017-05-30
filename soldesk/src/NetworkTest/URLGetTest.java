package NetworkTest;

import java.io.*;
import java.net.*;
import java.util.*;

public class URLGetTest {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		URL url = new URL("http://www.naeiltour.co.kr:80/main/index.asp");
		
		//HTTP ����
		HttpURLConnection conn = (HttpURLConnection)url.openConnection();
		//���� �ڵ� ���ϱ�
		System.out.println(conn.getResponseCode());
		// ���� �޽���
		System.out.println(conn.getResponseMessage());
		//������ ���� ���ϱ�
		System.out.println(conn.getContentType());
		
		//��� ���ϱ�
		for(Map.Entry<String, List<String>> header : conn.getHeaderFields().entrySet()){
			for(String value : header.getValue()){
				System.out.println(header.getKey()+":"+value);
			}
		}
		
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









