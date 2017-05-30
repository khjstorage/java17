package NetworkTest;

import java.io.*;
import java.net.*;

public class UDPEchoServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 1){
			System.out.println("���� : java UDPEchoServer port");
			System.exit(0);
		}
		
		int port = 0;
		try{
			port = Integer.parseInt(args[0]);
		}catch(Exception e){
			System.out.println("Port ��ȣ�� ���� ������ �Է��� �ּ���.");
			System.exit(0);
		}
		
		// Ŭ���̾�Ʈ���� DatagramPacket�� �����ϰų� �����ϱ� ���� DatagramSocket ��ü ����
		DatagramSocket dsock = null;
		try{
			System.out.println("���� �������Դϴ�.");
			dsock = new DatagramSocket(port);
			String line = null;
			
			while(true){
				// ���� �۾�
				byte[] buffer = new byte[1024];
				DatagramPacket receviePacket = new DatagramPacket(buffer, buffer.length);
				dsock.receive(receviePacket);
				
				//���۹��� �����͸� String ��ü�� �����ϰ� ���
				String msg = new String(receviePacket.getData(), 0,  receviePacket.getLength());
				System.out.println("���� ���� ���ڿ� :"+msg);
				if(msg.equals("quit")) break;
				
				// ���� �۾�
				DatagramPacket sendPacket = new DatagramPacket(receviePacket.getData(), 
						receviePacket.getData().length, receviePacket.getAddress(), receviePacket.getPort());
				dsock.send(sendPacket);
			}
			System.out.println("UDPEchoServer�� �����մϴ�.");
		}catch(IOException e){
			e.printStackTrace();
		}catch(Exception r){
			r.printStackTrace();
		}finally{
			if(dsock != null) dsock.close();
		}

	}

}









