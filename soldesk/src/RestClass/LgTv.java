package RestClass;

public class LgTv implements RemoteControl {
	public String brandName = "LG TV";
	
	public LgTv(){
		System.out.println("�귣�� �̸� : "+brandName);
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("����Tv ���� ��");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("����Tv ���� ����");
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("����Tv ���� ��");
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("����Tv ���� �ٿ�");
	}

	@Override
	public void channelUp() {
		// TODO Auto-generated method stub
		System.out.println("����Tv ä�� ��");
	}

	@Override
	public void channelDown() {
		// TODO Auto-generated method stub
		System.out.println("����Tv ä�� �ٿ�");
	}

}
