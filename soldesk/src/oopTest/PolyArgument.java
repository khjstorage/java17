package oopTest;

public class PolyArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer b = new Buyer();
		ATv tv = new ATv();
		AComputer comp = new AComputer();
		Audio au = new Audio();
		
		b.buy(tv);
		b.buy(comp);
		b.buy(au);
		b.summary();
		System.out.println();
		b.refund(comp);
		b.summary();
	}

}
