package RestClass;

public class SonyTv implements RemoteControl {
	public String brandName = "�Ҵ� ����~~";
	
	public SonyTv(){
		System.out.println("�귣�� �̸� : "+brandName);
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("�Ҵ�Tv ���� ��");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("�Ҵ�Tv ���� ����");
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("�Ҵ�Tv ���� ��");
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("�Ҵ�Tv ���� �ٿ�");
	}

	@Override
	public void channelUp() {
		// TODO Auto-generated method stub
		System.out.println("�Ҵ�Tv ä�� ��");
	}

	@Override
	public void channelDown() {
		// TODO Auto-generated method stub
		System.out.println("�Ҵ�Tv ä�� �ٿ�");
	}

}
