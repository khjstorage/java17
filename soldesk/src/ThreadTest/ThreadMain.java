package ThreadTest;

public class ThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���� ó�� ����");
		
		SampleThread thread = new SampleThread();
		thread.start();
		
		Thread thread1 = new Thread(new SampleRunnable());
		thread1.start();
		
		System.out.println("���� ó�� ����");
	}

}










