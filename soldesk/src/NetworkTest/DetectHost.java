package NetworkTest;

import java.net.*;
import javax.swing.*;

public class DetectHost {
	private InetAddress address;
	private InetAddress[] arrayAddress;
	private String hostValue;
	private StringBuffer stringBuffer = new StringBuffer("[ȣ��Ʈ ���� �˻� ���]\n\n");
	
	public DetectHost(){
		try{
			hostValue = JOptionPane.showInputDialog("�˻��� ȣ��Ʈ �� �Է� : ");
			address = InetAddress.getByName(hostValue);
			arrayAddress = InetAddress.getAllByName(hostValue);
			
			for(int i=0;i<arrayAddress.length;i++){
				stringBuffer.append("DNS : "+arrayAddress[i].getHostName()+" / ");
				stringBuffer.append("IP : "+arrayAddress[i].getHostAddress()+"\n");
			}
			
			stringBuffer.append("PC Name : "+address.getCanonicalHostName()+"\n");
		}catch(UnknownHostException e){
			stringBuffer.append("�Է��� �ּҳ� IP���� �˻��� ���� �����ϴ�.\n(Error:�ּҰ� ����)");
		}finally{
			JOptionPane.showMessageDialog(null, stringBuffer);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DetectHost();
	}

}











