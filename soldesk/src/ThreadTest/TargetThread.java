package ThreadTest;

public class TargetThread extends Thread {
	@Override
	public void run(){
		for(long i=0;i<2000000000;i++){}
		
		try{
			Thread.sleep(1500);	// 1.5ÃÊ
		}catch(Exception e){
			
		}
		
		for(long i=0;i<2000000000;i++){}
	}
}
