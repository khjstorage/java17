package oopTest2;

public class AbsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PayGood payGood = new PayGood();
		payGood.cash();
		payGood.card();
		payGood.phone();
		System.out.println("-------------------------------------");
		
		Pay2015 pay2015 = new Pay2015();
		pay2015.cash();
		pay2015.card();
		pay2015.phone();
		System.out.println("-------------------------------------");
		
		System.out.println("�θ� Ŭ������ �ڽ� Ŭ���� ��ü�� �Ҵ���� ���");
		Payment payMent = null;
		payMent = new PayGood();
		payMent.cash();
		payMent.card();
		payMent.phone();
		System.out.println("-------------------------------------");
		
		payMent = new Pay2015();
		payMent.cash();
		payMent.card();
		payMent.phone();
	}

}



