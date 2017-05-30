package RestClass;

public class SonyTv implements RemoteControl {
	public String brandName = "소니 베가~~";
	
	public SonyTv(){
		System.out.println("브랜드 이름 : "+brandName);
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("소니Tv 전원 온");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("소니Tv 전원 오프");
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("소니Tv 볼륨 온");
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("소니Tv 볼륨 다운");
	}

	@Override
	public void channelUp() {
		// TODO Auto-generated method stub
		System.out.println("소니Tv 채널 업");
	}

	@Override
	public void channelDown() {
		// TODO Auto-generated method stub
		System.out.println("소니Tv 채널 다운");
	}

}
