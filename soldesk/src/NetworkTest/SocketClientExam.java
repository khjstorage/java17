package NetworkTest;

import java.io.*;
import java.net.*;

public class SocketClientExam {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		try(
				// 서버와 통신을 하기 위한 Socket 생성
				Socket socket = new Socket("www.soldesk.com", 80);
				// 서버에 데이터를 송신하기 위한 OutputStream 생성
				OutputStream out = socket.getOutputStream();
				// 서버로부터 데이터를 수신하기 위한 InputStream 생성
				InputStream in = socket.getInputStream()){
			//서버에 데이터를 송신
			out.write("GET / HTTP/1.0\n\n".getBytes());
			
			// 서버로부터 데이터를 수신
			try(ByteArrayOutputStream bytes = new ByteArrayOutputStream()){
				byte[] buf = new byte[1024*8];
				int length = 0;
				
				while( (length = in.read(buf)) != -1 ){
					bytes.write(buf, 0, length);
				}
				
				// 서버에서 수신한 데이터를 콘솔에 표시
				System.out.println( new String(bytes.toByteArray(), "UTF-8") );
			}
		}

	}

}








