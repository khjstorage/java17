package NetworkTest;

import java.net.*;
import javax.swing.*;

public class DetectHost {
	private InetAddress address;
	private InetAddress[] arrayAddress;
	private String hostValue;
	private StringBuffer stringBuffer = new StringBuffer("[호스트 정보 검색 결과]\n\n");
	
	public DetectHost(){
		try{
			hostValue = JOptionPane.showInputDialog("검색할 호스트 값 입력 : ");
			address = InetAddress.getByName(hostValue);
			arrayAddress = InetAddress.getAllByName(hostValue);
			
			for(int i=0;i<arrayAddress.length;i++){
				stringBuffer.append("DNS : "+arrayAddress[i].getHostName()+" / ");
				stringBuffer.append("IP : "+arrayAddress[i].getHostAddress()+"\n");
			}
			
			stringBuffer.append("PC Name : "+address.getCanonicalHostName()+"\n");
		}catch(UnknownHostException e){
			stringBuffer.append("입력한 주소나 IP값을 검색할 수가 없습니다.\n(Error:주소값 오류)");
		}finally{
			JOptionPane.showMessageDialog(null, stringBuffer);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DetectHost();
	}

}











