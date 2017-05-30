package NetworkTest;

import java.io.*;
import java.net.*;

public class EchoClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			// Ŭ���̾�Ʈ ����
			Socket sock = new Socket("127.0.0.1", 10001);
			BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
			
			OutputStream out = sock.getOutputStream();
			InputStream in = sock.getInputStream();
			
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			
			String line = null;
			while( (line=keyboard.readLine()) != null  ){
				if(line.equals("quit")) break;
				
				// PrintWriter�� �ִ� println()�޼��带 �̿��ؼ� ������ ����Ÿ ����
				pw.println(line);
				pw.flush();
				
				// ������ �ٽ� ��ȯ�ϴ� ���ڿ��� BufferedReader�� �ִ� readLine() �޼��带 �̿��ؼ� �о����
				String echo = br.readLine();
				System.out.println("�����κ��� ���޹��� ���ڿ� : "+echo);				
			}
			
			pw.close();
			br.close();
			sock.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}












