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
		System.out.println("Ŭ���̾�Ʈ�� ������ ��ٸ��� �����մϴ�.");
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
					acp_sock = serverSocket.accept();		// Ŭ���̾�Ʈ ���� ���� ���� ����
					
					// ��Ʈ���� ���ϰ� ����
					DataInputStream read = new DataInputStream(acp_sock.getInputStream());
					DataOutputStream write = new DataOutputStream(acp_sock.getOutputStream());
					
					System.out.println("Ŭ���̾�Ʈ ���� :"+acp_sock.getInetAddress().getHostName());
					System.out.println("Ŭ���̾�Ʈ�κ��� ������ ��ٸ��ϴ�.");
					
					while(true){
						// Ŭ���̾�Ʈ�κ��� String�� ������ �޴� ����
						try{
							recv_str = read.readUTF();
						}catch(Exception e){
							System.out.println("**********���� ����***********");
							break;
						}
						
						System.out.println("Ŭ���̾�Ʈ���� �� �޼��� : "+recv_str);
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
									result = "���� \"0���� ���� �� �����ϴ�.\"";
								}else{
									result = digit1+"/"+digit2+"="+(digit1/digit2);
								}
							}else if(recv_str.indexOf("+")==-1 || recv_str.indexOf("-")==-1 || recv_str.indexOf("*")==-1 || recv_str.indexOf("/")==-1){
								result = "������� �����ϴ�.";
							}
						}catch(Exception e){
							result = "����Ŀ� ������ �ֽ��ϴ�.";
						}
						
						try{
							write.writeUTF(result);
						}catch(Exception e){  }
						
					}// ���� while��
				}// �ٱ��� while��
			}catch(Exception e){
				e.printStackTrace();
			}//try ~catch end
			
		}// run method end
	}// inner class end
}









