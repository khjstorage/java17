package NetworkTest;

import java.io.*;
import java.net.*;

public class UDPClient {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		DatagramSocket socket = new DatagramSocket();
		byte[] buffer = new byte[256];
		
		InetAddress address = InetAddress.getByName("127.0.0.1");
		DatagramPacket packet = new DatagramPacket(buffer, buffer.length, address, 10000);
		socket.send(packet);
		
		packet = new DatagramPacket(buffer, buffer.length);
		socket.receive(packet);
		
		String receiveStr = new String(packet.getData());
		System.out.println("Today's lunch : "+receiveStr);
		
		socket.close();
	}

}










