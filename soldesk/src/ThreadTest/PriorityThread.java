package ThreadTest;

public class PriorityThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityChild1 th1 = new PriorityChild1();
		PriorityChild2 th2 = new PriorityChild2();
		
		th2.setPriority(10);
		
		System.out.println("Priority of th1(-) : "+th1.getPriority());
		System.out.println("Priority of th2(|) : "+th2.getPriority());
		
		th1.start();
		th2.start();
	}

}









