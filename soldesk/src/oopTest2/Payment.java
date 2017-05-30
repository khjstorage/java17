package oopTest2;

abstract class Payment {
	public void cash(){
		System.out.println("현금결제");
	}
	
	public abstract void card();
	public abstract void phone();
}
