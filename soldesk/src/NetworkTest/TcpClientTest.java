package NetworkTest;

import java.io.*;
import java.net.*;

public class TcpClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			String serverIP = "127.0.0.1";  // localhost
			System.out.println("������ �������Դϴ�. ���� IP :"+serverIP);
			
			// ���� �����Ͽ� ���� ��û �۾�
			Socket socket = new Socket(serverIP, 5000);
			// ������ �Է½�Ʈ�� ���
			InputStream in = socket.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			
			System.out.println("�����κ��� ���� �޽��� : "+dis.readUTF());
			System.out.println("������ �����մϴ�.");
			
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









