package oopTest;

public class ColorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cpoint a, b;
		
		a = new Cpoint(2,3);
		b = new AColorPoint(3, 4, "red");
		
		a.show();
		b.show();
		
		System.out.println(a);
		System.out.println(b);
	}

}
