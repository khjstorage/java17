package ThreadTest;

class PriorityChild1 extends Thread {
	public void run(){
		for(int i=0;i<300;i++){
			System.out.print("-");
			for(int x=0;x<10000000;x++){}
		}
	}
}

class PriorityChild2 extends Thread {
	public void run(){
		for(int i=0;i<300;i++){
			System.out.print("|");
			for(int x=0;x<10000000;x++){}
		}
	}
}