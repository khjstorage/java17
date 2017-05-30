package ThreadTest;

import java.util.concurrent.TimeUnit;

public class LockConditionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LockCondition condition = new LockCondition();
		
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try{
					String str = condition.get();
					System.out.println("√ÎµÊ:"+str);
					
					TimeUnit.SECONDS.sleep(5);
					
					System.out.println("«ÿ¡¶:"+str);
					condition.add(str);
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
