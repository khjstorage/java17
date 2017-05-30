package RestClass;

public class InterFaceImplementTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl samsungTv = new SamsungTv();
		RemoteControl lgTv = new LgTv();
		RemoteControl sonyTv = new SonyTv();
		
		samsungTv.powerOn();
		lgTv.powerOn();
		sonyTv.powerOn();
		
		samsungTv.volumeUp();
		lgTv.volumeUp();
		sonyTv.volumeUp();
		
		samsungTv.channelUp();
		lgTv.channelUp();
		sonyTv.channelUp();
	}

}
