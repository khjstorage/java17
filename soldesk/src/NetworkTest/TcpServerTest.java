package NetworkTest;

import java.io.*;
import java.net.*;
import java.util.*;
import java.text.*;

public class TcpServerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket serverSocket = null;
		
		try{
			// 서버소켓을 생성하고 5000번 포트와 결합(bind) 작업
			serverSocket = new ServerSocket(5000);
			System.out.println(getTime()+" 서버가 준비되었습니다.");
		}catch(IOException e){
			e.printStackTrace();
		}
		
		while(true){
			try{
				System.out.println(getTime()+" 연결 요청을 기다립니다.");
				/*
				 * 서버소켓은 클라이언트의 연결 요청이 올 때까지 실행을 멈추고 계속 기다림.
				 * 클라이언트의 연결 요청이 오면 클라이너트 소켓과 통신할 새로운 소켓을 생성
				 */
				Socket socket = serverSocket.accept();
				System.out.println(getTime()+socket.getInetAddress()+"로부터 연결요청이 들어왔습니다.");
				
				// 소켓의 출력스트림을 얻는다.
				OutputStream out = socket.getOutputStream();
				DataOutputStream dos = new DataOutputStream(out);
				
				dos.writeUTF("서버로부터의 메시지입니다.");
				System.out.println(getTime()+" 데이터를 전송했습니다.");
				
				dos.close();
				socket.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
	
	static String getTime(){
		SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
		
		return f.format(new Date());
	}

}









