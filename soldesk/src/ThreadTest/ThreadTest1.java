package ThreadTest;

import javax.swing.JOptionPane;

public class ThreadTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadTest1_1 th1 = new ThreadTest1_1();
		th1.start();
		
		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���.");
		System.out.println("�Է��Ͻ� ���� "+ input +"�Դϴ�.");
	}
}

class ThreadTest1_1 extends Thread{
	@Override
	public void run(){
		for(int i=10;i>0;i--){
			System.out.println(i);
			try{
				sleep(1000);
			}catch(Exception e){
				
			}
		}
	}
}










