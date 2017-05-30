package ThreadTest;

class CalcThread extends Thread{
	public CalcThread(String name){
		setName(name);
	}
	
	public void run(){
		for(long i=0;i<2000000000;i++){}
		
		System.out.println(getName());
	}
}

public class PriorityTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=10;i++){
			Thread thread = new CalcThread("thread"+i);
			
			if(i!=10){
				thread.setPriority(Thread.MIN_PRIORITY);
			}else{
				thread.setPriority(Thread.MAX_PRIORITY);
			}
			
			thread.start();
		}
	}

}






