package NetworkTest;

import java.io.*;
import java.net.*;

import javax.sound.sampled.ReverbType;

public class ThreadClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		Socket sock = null;
		DataInputStream read;
		DataOutputStream write;
		
		String send_str = "", recv_str ="";
		
		try{
			sock = new Socket("127.0.0.1", 60000);
			read = new DataInputStream(sock.getInputStream());
			write = new DataOutputStream(sock.getOutputStream());
			
			System.out.println("*********** 접속 성공!************");
			
			while(true){
				System.out.println("연산식: ");
				send_str = in.readLine();
				
				try{
					write.writeUTF(send_str);
				}catch(Exception e){
					e.printStackTrace();
				}
				
				try{
					recv_str = read.readUTF();
				}catch(Exception e){
					e.printStackTrace();
				}
				
				System.out.println("결과값 : "+ recv_str);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}









