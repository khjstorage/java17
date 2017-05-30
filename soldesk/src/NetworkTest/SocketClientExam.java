package NetworkTest;

import java.io.*;
import java.net.*;

public class SocketClientExam {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		try(
				// ������ ����� �ϱ� ���� Socket ����
				Socket socket = new Socket("www.soldesk.com", 80);
				// ������ �����͸� �۽��ϱ� ���� OutputStream ����
				OutputStream out = socket.getOutputStream();
				// �����κ��� �����͸� �����ϱ� ���� InputStream ����
				InputStream in = socket.getInputStream()){
			//������ �����͸� �۽�
			out.write("GET / HTTP/1.0\n\n".getBytes());
			
			// �����κ��� �����͸� ����
			try(ByteArrayOutputStream bytes = new ByteArrayOutputStream()){
				byte[] buf = new byte[1024*8];
				int length = 0;
				
				while( (length = in.read(buf)) != -1 ){
					bytes.write(buf, 0, length);
				}
				
				// �������� ������ �����͸� �ֿܼ� ǥ��
				System.out.println( new String(bytes.toByteArray(), "UTF-8") );
			}
		}

	}

}








