package ThreadTest;

import java.util.concurrent.TimeUnit;

public class SleepSample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(5000);	// 5초동안 정지
		
		TimeUnit.SECONDS.sleep(5);	//5초동안 정지
		TimeUnit.MINUTES.sleep(1);		//1분동안 정지
		
		long millis = TimeUnit.HOURS.toMillis(1);	// 1시간을 밀리초로 변환
		System.out.println(millis);	
		
		long seconds = TimeUnit.MINUTES.toSeconds(90);	//90분을 초로 변환
		System.out.println(seconds);
		
		long hours = TimeUnit.DAYS.toHours(12);		//12일을 시간으로 변환
		System.out.println(hours);
	}

}









