package oopTest2;

abstract class Payment {
	public void cash(){
		System.out.println("���ݰ���");
	}
	
	public abstract void card();
	public abstract void phone();
}
