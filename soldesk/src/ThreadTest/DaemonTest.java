package ThreadTest;

class AutoSaveThread extends Thread{
	public void save(){
		System.out.println("작업 내용을 저장함.");
	}
	
	@Override
	public void run(){
		while(true){
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				break;
			}
			
			save();
		}
	}
}

public class DaemonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AutoSaveThread ast = new AutoSaveThread();
		ast.setDaemon(true);
		ast.start();
		
		try{
			Thread.sleep(3000);
		}catch(InterruptedException e){
			
		}
		
		System.out.println("메인 스레드 종료");
	}

}








