package ThreadTest;

import java.util.concurrent.*;

public class ExchangeThread extends Thread{
	private String data;
	private long time;
	private Exchanger<String> exchanger;
	
	public ExchangeThread(String data, long time, Exchanger<String> exchanger){
		this.data = data;
		this.time = time;
		this.exchanger = exchanger;
	}
	
	@Override
	public void run(){
		try{
			// ��ȯ ���� �����͸� ǥ��
			System.out.println(getName()+"(��ȯ ��): "+this.data);
			
			// �����ڿ��� ������ �и��� ���
			Thread.sleep(this.time);
			
			// �����͸� ��ȯ
			data = exchanger.exchange(this.data);
			
			//��ȯ �� �����͸� ǥ��
			System.out.println(getName()+"(��ȯ ��): "+this.data);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exchanger<String> exchanger = new Exchanger<String>();
		
		new ExchangeThread("data1", 1000, exchanger).start();
		new ExchangeThread("data2", 3000, exchanger).start();
	}

}








