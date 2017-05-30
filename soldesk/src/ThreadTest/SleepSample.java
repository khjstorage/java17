package ThreadTest;

import java.util.concurrent.TimeUnit;

public class SleepSample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(5000);	// 5�ʵ��� ����
		
		TimeUnit.SECONDS.sleep(5);	//5�ʵ��� ����
		TimeUnit.MINUTES.sleep(1);		//1�е��� ����
		
		long millis = TimeUnit.HOURS.toMillis(1);	// 1�ð��� �и��ʷ� ��ȯ
		System.out.println(millis);	
		
		long seconds = TimeUnit.MINUTES.toSeconds(90);	//90���� �ʷ� ��ȯ
		System.out.println(seconds);
		
		long hours = TimeUnit.DAYS.toHours(12);		//12���� �ð����� ��ȯ
		System.out.println(hours);
	}

}









