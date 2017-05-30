package ThreadTest;

public class ThreadTest extends Thread {
	@Override
	public void run(){
		System.out.println(getName()+":Start");
		
		try{
			Thread.sleep(5000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		System.out.println(getName()+":End");
	}
}
