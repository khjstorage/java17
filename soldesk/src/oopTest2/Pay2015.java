package oopTest2;

public class Pay2015 extends Payment {
	
	@Override
	public void cash(){
		System.out.println("���� ���� ����");
	}

	@Override
	public void card() {
		// TODO Auto-generated method stub
		System.out.println("�ſ� ī�� ����(������ 1% ����)");
	}

	@Override
	public void phone() {
		// TODO Auto-generated method stub
		System.out.println("�޴��� ����(������ 1% ����)");
	}

}
