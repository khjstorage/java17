package ThreadTest;

public class ThreadStateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StatePrintTest thread = new StatePrintTest(new TargetThread());
		thread.start();
	}

}
