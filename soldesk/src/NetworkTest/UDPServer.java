package NetworkTest;

import java.io.*;
import java.net.*;

public class UDPServer {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		DatagramSocket socket = new DatagramSocket(10000);
		boolean listen = true;
		
		while(listen){
			byte[] buffer = new byte[256];
			DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
			socket.receive(packet);  // �� �κ� �߰�
			
			String menu = LunchMenu.selectMenu(); 
			buffer = menu.getBytes();
			
			//�� �κ� ����
			packet = new DatagramPacket(buffer, buffer.length, packet.getAddress(), packet.getPort());
			socket.send(packet);	
		}
		
		socket.close();
	}

}














