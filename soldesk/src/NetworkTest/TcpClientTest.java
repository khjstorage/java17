package NetworkTest;

import java.io.*;
import java.net.*;

public class TcpClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			String serverIP = "127.0.0.1";  // localhost
			System.out.println("서버에 연결중입니다. 서버 IP :"+serverIP);
			
			// 소켓 생성하여 연결 요청 작업
			Socket socket = new Socket(serverIP, 5000);
			// 소켓의 입력스트림 얻기
			InputStream in = socket.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			
			System.out.println("서버로부터 받은 메시지 : "+dis.readUTF());
			System.out.println("연결을 종료합니다.");
			
			dis.close();
			socket.close();
		}catch(ConnectException ce){
			ce.printStackTrace();
		}catch(IOException ie){
			ie.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}









