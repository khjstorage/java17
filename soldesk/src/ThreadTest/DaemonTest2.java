package ThreadTest;

public class DaemonTest2 implements Runnable {
	static boolean autoSave = false;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			try{
				Thread.sleep(3000);
			}catch(InterruptedException e){				
			}
			
			if(autoSave)
				autoSave();
		}
	}
	
	private void autoSave(){
		System.out.println("작업파일이 자동저장되었습니다.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new DaemonTest2());
		t.setDaemon(true);
		t.start();
		
		for(int i=0;i<=20;i++){
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){	
			}
			
			System.out.println(i);
			
			if(i==5)
				autoSave =true;
		}
		
		System.out.println("프로그램을 종료합니다.");
	}

}








