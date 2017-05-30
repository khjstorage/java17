package NetworkTest;

import java.io.*;
import java.net.*;

public class EchoServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			// 10001번 포트에서 동작하는 ServerSocket 생성
			ServerSocket server = new ServerSocket(10001);
			System.out.println("Wating connect........");
			
			Socket sock = server.accept();		// 클라이언트가 접속했을 겨우 Socket 객체 반환
			InetAddress inetAddr = sock.getInetAddress();
			System.out.println(inetAddr.getHostAddress()+" 로부터 접속했습니다.");
			
			OutputStream out = sock.getOutputStream();
			InputStream in = sock.getInputStream();
			
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			
			String line = null;
			
			while( (line=br.readLine()) != null){
				System.out.println("클라이언트로부터 전송받은 문자열 : "+line);
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













