package NetworkTest;

import java.io.*;
import java.net.*;

public class UDPEchoClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 2){
			System.out.println("사용법 : java UDPEchoClient ip por");
			System.exit(0);
		}
		
		String ip = args[0];
		int port = 0;
		
		try{
			port = Integer.parseInt(args[1]);
		}catch(Exception e){
			System.out.println("port 번호는 양의 정수로 입력해주세요.");
			System.exit(0);
		}
		
		InetAddress inetAddr = null;
		try{
			inetAddr = InetAddress.getByName(ip);
		}catch(UnknownHostException e){
			System.out.println("잘못된 도메인이나 IP입니다.");
			System.exit(0);
		}
		
		// 전송/수신 작업 시작
		DatagramSocket dsock = null;
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			dsock = new DatagramSocket();
			
			String line = null;
			while( (line = br.readLine()) != null ){
				DatagramPacket sendPacket = new DatagramPacket(line.getBytes(), line.getBytes().length, 
						inetAddr, port);
				dsock.send(sendPacket);
				
				if(line.equals("quit")) break;
				
				// 수신
				byte[] buffer = new byte[line.getBytes().length];
				DatagramPacket receivePacket = new DatagramPacket(buffer, buffer.length);
				dsock.receive(receivePacket);
				
				String msg = new String(receivePacket.getData(), 0, receivePacket.getData().length);
				System.out.println("전송받은 문자열 :"+msg);
			}
			System.out.println("UDPEchoClient를 종료합니다.");
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(dsock != null) dsock.close();
		}
	}

}










