package NetworkTest;

import java.io.*;
import java.net.*;

public class UDPEchoServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 1){
			System.out.println("사용법 : java UDPEchoServer port");
			System.exit(0);
		}
		
		int port = 0;
		try{
			port = Integer.parseInt(args[0]);
		}catch(Exception e){
			System.out.println("Port 번호는 양의 정수로 입력해 주세요.");
			System.exit(0);
		}
		
		// 클라이언트에게 DatagramPacket을 전송하거나 수신하기 위해 DatagramSocket 객체 생성
		DatagramSocket dsock = null;
		try{
			System.out.println("접속 대기상태입니다.");
			dsock = new DatagramSocket(port);
			String line = null;
			
			while(true){
				// 수신 작업
				byte[] buffer = new byte[1024];
				DatagramPacket receviePacket = new DatagramPacket(buffer, buffer.length);
				dsock.receive(receviePacket);
				
				//전송받은 데이터를 String 객체에 지정하고 출력
				String msg = new String(receviePacket.getData(), 0,  receviePacket.getLength());
				System.out.println("전송 받은 문자열 :"+msg);
				if(msg.equals("quit")) break;
				
				// 전송 작업
				DatagramPacket sendPacket = new DatagramPacket(receviePacket.getData(), 
						receviePacket.getData().length, receviePacket.getAddress(), receviePacket.getPort());
				dsock.send(sendPacket);
			}
			System.out.println("UDPEchoServer를 종료합니다.");
		}catch(IOException e){
			e.printStackTrace();
		}catch(Exception r){
			r.printStackTrace();
		}finally{
			if(dsock != null) dsock.close();
		}

	}

}









