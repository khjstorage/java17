package ThreadTest;

import java.util.concurrent.*;

public class SampleThread extends Thread {
	
	@Override
	public  void run(){
		try{
			TimeUnit.SECONDS.sleep(2);
			
			System.out.println("Thread�� ����� �񵿱� ó��");
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
