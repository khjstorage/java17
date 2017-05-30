package oopTest2;

public class PayGood extends Payment {

	@Override
	public void card() {
		// TODO Auto-generated method stub
		System.out.println("신용카드 결제");
	}

	@Override
	public void phone() {
		// TODO Auto-generated method stub
		System.out.println("휴대폰 결제");
	}

}
