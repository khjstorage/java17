package RestClass;

public class SamsungTv implements RemoteControl {
	public String brandName = "������";
	
	public SamsungTv(){
		System.out.println("�귣�� �̸� : "+brandName);
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("�ＺTv ���� ��");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("�ＺTv ���� ����");
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("�ＺTv ���� ��");
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("�ＺTv ���� �ٿ�");
	}

	@Override
	public void channelUp() {
		// TODO Auto-generated method stub
		System.out.println("�ＺTv ä�� ��");
	}

	@Override
	public void channelDown() {
		// TODO Auto-generated method stub
		System.out.println("�ＺTv ä�� �ٿ�");
	}

}
