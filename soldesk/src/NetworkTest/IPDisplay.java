package NetworkTest;

import java.net.InetAddress;

public class IPDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			// 네이버의 IP 정보 출력
			InetAddress[] ia = InetAddress.getAllByName("daum.net");
			
			for(InetAddress imsi : ia){
				System.out.println("IP 주소 :"+imsi.getHostAddress());
			}
			
			// 자신의 IP 주소 가져오기
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("My PC IP:"+local.getHostAddress());
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}








