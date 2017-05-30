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
			// ���������� �����ϰ� 5000�� ��Ʈ�� ����(bind) �۾�
			serverSocket = new ServerSocket(5000);
			System.out.println(getTime()+" ������ �غ�Ǿ����ϴ�.");
		}catch(IOException e){
			e.printStackTrace();
		}
		
		while(true){
			try{
				System.out.println(getTime()+" ���� ��û�� ��ٸ��ϴ�.");
				/*
				 * ���������� Ŭ���̾�Ʈ�� ���� ��û�� �� ������ ������ ���߰� ��� ��ٸ�.
				 * Ŭ���̾�Ʈ�� ���� ��û�� ���� Ŭ���̳�Ʈ ���ϰ� ����� ���ο� ������ ����
				 */
				Socket socket = serverSocket.accept();
				System.out.println(getTime()+socket.getInetAddress()+"�κ��� �����û�� ���Խ��ϴ�.");
				
				// ������ ��½�Ʈ���� ��´�.
				OutputStream out = socket.getOutputStream();
				DataOutputStream dos = new DataOutputStream(out);
				
				dos.writeUTF("�����κ����� �޽����Դϴ�.");
				System.out.println(getTime()+" �����͸� �����߽��ϴ�.");
				
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









