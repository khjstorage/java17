package oopTest;

public class CaptionTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		Car car2 = null;
		FireEngine fe = new FireEngine();
		
		car.drive();
//		fe = (FireEngine)car;
//		fe.drive();
		car2 = fe;
		car2.drive();
	}

}
