package NetworkTest;

import java.io.*;
import java.net.*;

public class ThreadServer implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		ServerSocket serverSocket = new ServerSocket(60000);
		System.out.println("클라이언트의 접속을 기다리기 시작합니다.");
		for(int i=0;i<19;i++){
			new Connection(serverSocket);
		}
	}
	
	static class Connection extends Thread{
		private ServerSocket serverSocket;
		
		public Connection(ServerSocket svrSocket){
			this.serverSocket = svrSocket;
			start();
		}
		
		@Override
		public void run(){
			Socket acp_sock = null;
			String recv_str = null;
			double digit1=0, digit2 = 0;
			String result ="";
			
			try{
				while(true){
					acp_sock = serverSocket.accept();		// 클라이언트 접속 수락 소켓 생성
					
					// 스트림을 소켓과 결합
					DataInputStream read = new DataInputStream(acp_sock.getInputStream());
					DataOutputStream write = new DataOutputStream(acp_sock.getOutputStream());
					
					System.out.println("클라이언트 접속 :"+acp_sock.getInetAddress().getHostName());
					System.out.println("클라이언트로부터 응답을 기다립니다.");
					
					while(true){
						// 클라이언트로부터 String형 정보를 받는 과정
						try{
							recv_str = read.readUTF();
						}catch(Exception e){
							System.out.println("**********접속 종료***********");
							break;
						}
						
						System.out.println("클라이언트에서 온 메세지 : "+recv_str);
						try{
							if(recv_str.indexOf("+") != -1){
								digit1 = Integer.parseInt(recv_str.substring(0, recv_str.indexOf("+")).trim());
								digit2 = Integer.parseInt(recv_str.substring(recv_str.indexOf("+")+1, recv_str.length()).trim());
								result = digit1+"+"+digit2+"="+(digit1+digit2);
							}else if(recv_str.indexOf("-") != -1){
								digit1 = Integer.parseInt(recv_str.substring(0, recv_str.indexOf("-")).trim());
								digit2 = Integer.parseInt(recv_str.substring(recv_str.indexOf("-")+1, recv_str.length()).trim());
								result = digit1+"-"+digit2+"="+(digit1-digit2);
							}else if(recv_str.indexOf("*") != -1){
								digit1 = Integer.parseInt(recv_str.substring(0, recv_str.indexOf("*")).trim());
								digit2 = Integer.parseInt(recv_str.substring(recv_str.indexOf("*")+1, recv_str.length()).trim());
								result = digit1+"*"+digit2+"="+(digit1*digit2);
							}else if(recv_str.indexOf("/") != -1){
								digit1 = Integer.parseInt(recv_str.substring(0, recv_str.indexOf("/")).trim());
								digit2 = Integer.parseInt(recv_str.substring(recv_str.indexOf("/")+1, recv_str.length()).trim());
								
								if(digit2==0){
									result = "에러 \"0으로 나눌 수 없습니다.\"";
								}else{
									result = digit1+"/"+digit2+"="+(digit1/digit2);
								}
							}else if(recv_str.indexOf("+")==-1 || recv_str.indexOf("-")==-1 || recv_str.indexOf("*")==-1 || recv_str.indexOf("/")==-1){
								result = "연산식이 없습니다.";
							}
						}catch(Exception e){
							result = "연산식에 오류가 있습니다.";
						}
						
						try{
							write.writeUTF(result);
						}catch(Exception e){  }
						
					}// 안쪽 while문
				}// 바깥쪽 while문
			}catch(Exception e){
				e.printStackTrace();
			}//try ~catch end
			
		}// run method end
	}// inner class end
}









