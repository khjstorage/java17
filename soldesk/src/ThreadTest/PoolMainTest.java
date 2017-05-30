package ThreadTest;

import java.util.concurrent.*;

public class PoolMainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pool pool = new Pool();
		
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try{
					String str = pool.get();
					System.out.println("√ÎµÊ : "+str);
					
					TimeUnit.SECONDS.sleep(5);
					
					System.out.println("«ÿ¡¶:"+str);
					pool.add(str);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			}
		};
		
		for(int i=0;i<10;i++){
			Thread thread = new Thread(r);
			thread.start();
		}
	}

}








