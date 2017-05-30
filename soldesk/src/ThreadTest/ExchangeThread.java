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
			// 교환 전의 데이터를 표시
			System.out.println(getName()+"(교환 전): "+this.data);
			
			// 생성자에서 지정한 밀리초 대기
			Thread.sleep(this.time);
			
			// 데이터를 교환
			data = exchanger.exchange(this.data);
			
			//교환 후 데이터를 표시
			System.out.println(getName()+"(교환 후): "+this.data);
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








