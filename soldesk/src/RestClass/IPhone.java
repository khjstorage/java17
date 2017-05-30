package RestClass;

public class IPhone implements SmartPhone {

	@Override
	public void map() {
		// TODO Auto-generated method stub
		System.out.println("Apple 지도 지원");
	}

	@Override
	public void nfc() {
		// TODO Auto-generated method stub
		System.out.println("교통 카드 지원");
	}

}
