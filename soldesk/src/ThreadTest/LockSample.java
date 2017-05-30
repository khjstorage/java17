package ThreadTest;

import java.util.concurrent.locks.*;
import java.util.concurrent.*;

public class LockSample {
	private final Lock lock = new ReentrantLock();
	
	public void method(){
		try{
			//��� : ����� ������ ���
			lock.lock();
			System.out.println("��� ���:"+Thread.currentThread().getName());
			
			try{
				TimeUnit.SECONDS.sleep(2);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}finally{
			System.out.println("��� ����:"+Thread.currentThread().getName());
			lock.unlock();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LockSample sample = new LockSample();
		
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				sample.method();
			}
		};
		
		for(int i=0;i<5;i++){
			new Thread(r).start();  // ==> Thread s1 = new Thread(r);
		}
//		new Thread(r).start();
	}

}






