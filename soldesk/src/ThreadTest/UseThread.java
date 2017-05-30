package ThreadTest;

class UseT extends Thread{
//	long startTime = 0;
//		
		@Override
		public void run(){
			// Thread로 처리할 코드
						
			for(int i=0;i<300;i++){
				System.out.println("run i ==========>"+i);
			}
			
			System.out.print("소요시간2: "+(System.currentTimeMillis()-UseThread.startTime) );
		}
}

public class UseThread {
	static long startTime = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UseT ut = new UseT();
		ut.start();
		
		startTime = System.currentTimeMillis();
		
		for(int i=0;i<300;i++){
			System.out.println("---------------main i="+i);
		}
		
		System.out.print("소요시간1: "+(System.currentTimeMillis()-startTime) );
	}

}




