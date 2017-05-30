package NetworkTest;

import java.io.*;
import java.net.*;

public class UDPEchoClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 2){
			System.out.println("���� : java UDPEchoClient ip por");
			System.exit(0);
		}
		
		String ip = args[0];
		int port = 0;
		
		try{
			port = Integer.parseInt(args[1]);
		}catch(Exception e){
			System.out.println("port ��ȣ�� ���� ������ �Է����ּ���.");
			System.exit(0);
		}
		
		InetAddress inetAddr = null;
		try{
			inetAddr = InetAddress.getByName(ip);
		}catch(UnknownHostException e){
			System.out.println("�߸��� �������̳� IP�Դϴ�.");
			System.exit(0);
		}
		
		// ����/���� �۾� ����
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
				
				// ����
				byte[] buffer = new byte[line.getBytes().length];
				DatagramPacket receivePacket = new DatagramPacket(buffer, buffer.length);
				dsock.receive(receivePacket);
				
				String msg = new String(receivePacket.getData(), 0, receivePacket.getData().length);
				System.out.println("���۹��� ���ڿ� :"+msg);
			}
			System.out.println("UDPEchoClient�� �����մϴ�.");
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(dsock != null) dsock.close();
		}
	}

}










