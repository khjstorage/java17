package ThreadTest;

import java.util.concurrent.*;

public class SampleRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
			TimeUnit.SECONDS.sleep(2);
			
			System.out.println("Runnable�� ����� �񵿱�ó��");
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}

}
