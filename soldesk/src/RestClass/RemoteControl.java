package RestClass;

public interface RemoteControl {
	public int DEFAULT_VOLUME = 10;
	public void powerOn();
	public void powerOff();
	public void volumeUp();
	public void volumeDown();
	public void channelUp();
	public void channelDown();
}
