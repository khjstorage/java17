package ThreadTest;

public class JavaBakeryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaBakeryStore data = new JavaBakeryStore();
		
		Customer c1 = new Customer("�ư��� 1��", data);
		Customer c2 = new Customer("�ư��� 2��", data);
		Customer c3 = new Customer("�ư��� 3��", data);
		
		c1.start();
		c2.start();
		c3.start();
		
		BakeryFactory p1 = new BakeryFactory("�ĸ��ٰ�Ʈ", data);
		p1.start();
	}

}
