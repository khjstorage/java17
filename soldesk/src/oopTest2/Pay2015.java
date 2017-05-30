package oopTest2;

public class Pay2015 extends Payment {
	
	@Override
	public void cash(){
		System.out.println("현금 결재 할인");
	}

	@Override
	public void card() {
		// TODO Auto-generated method stub
		System.out.println("신용 카드 결재(수수료 1% 할인)");
	}

	@Override
	public void phone() {
		// TODO Auto-generated method stub
		System.out.println("휴대폰 결재(수수료 1% 할인)");
	}

}
