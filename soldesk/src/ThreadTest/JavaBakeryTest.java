package ThreadTest;

public class JavaBakeryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaBakeryStore data = new JavaBakeryStore();
		
		Customer c1 = new Customer("아가씨 1번", data);
		Customer c2 = new Customer("아가씨 2번", data);
		Customer c3 = new Customer("아가씨 3번", data);
		
		c1.start();
		c2.start();
		c3.start();
		
		BakeryFactory p1 = new BakeryFactory("파리바게트", data);
		p1.start();
	}

}
