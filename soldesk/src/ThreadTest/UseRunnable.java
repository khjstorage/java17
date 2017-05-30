package ThreadTest;

public class UseRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<300;i++){
			System.out.println("run i ------->"+i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UseRunnable ur = new UseRunnable();
		
		Thread t = new Thread(ur);
		
		t.start();
	
		for(int i=0;i<300;i++){
			System.out.println("main i>>>>>>>>>>>>> "+i);
		}
	}

}





