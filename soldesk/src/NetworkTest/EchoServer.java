package NetworkTest;

import java.io.*;
import java.net.*;

public class EchoServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			// 10001�� ��Ʈ���� �����ϴ� ServerSocket ����
			ServerSocket server = new ServerSocket(10001);
			System.out.println("Wating connect........");
			
			Socket sock = server.accept();		// Ŭ���̾�Ʈ�� �������� �ܿ� Socket ��ü ��ȯ
			InetAddress inetAddr = sock.getInetAddress();
			System.out.println(inetAddr.getHostAddress()+" �κ��� �����߽��ϴ�.");
			
			OutputStream out = sock.getOutputStream();
			InputStream in = sock.getInputStream();
			
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			
			String line = null;
			
			while( (line=br.readLine()) != null){
				System.out.println("Ŭ���̾�Ʈ�κ��� ���۹��� ���ڿ� : "+line);
				pw.println(line);
				pw.flush();
			}
			pw.close();
			br.close();
			sock.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}













