package NetworkTest;

import java.io.*;
import java.net.*;

public class EchoClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			// 클라이언트 소켓
			Socket sock = new Socket("127.0.0.1", 10001);
			BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
			
			OutputStream out = sock.getOutputStream();
			InputStream in = sock.getInputStream();
			
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			
			String line = null;
			while( (line=keyboard.readLine()) != null  ){
				if(line.equals("quit")) break;
				
				// PrintWriter에 있는 println()메서드를 이용해서 서버에 데이타 전송
				pw.println(line);
				pw.flush();
				
				// 서버가 다시 반환하는 문자열을 BufferedReader에 있는 readLine() 메서드를 이용해서 읽어들임
				String echo = br.readLine();
				System.out.println("서버로부터 전달받은 문자열 : "+echo);				
			}
			
			pw.close();
			br.close();
			sock.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}












