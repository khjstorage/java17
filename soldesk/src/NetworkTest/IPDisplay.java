package NetworkTest;

import java.net.InetAddress;

public class IPDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			// ���̹��� IP ���� ���
			InetAddress[] ia = InetAddress.getAllByName("daum.net");
			
			for(InetAddress imsi : ia){
				System.out.println("IP �ּ� :"+imsi.getHostAddress());
			}
			
			// �ڽ��� IP �ּ� ��������
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("My PC IP:"+local.getHostAddress());
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}








