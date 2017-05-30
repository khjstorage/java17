package ThreadTest;

import java.util.*;
import java.util.concurrent.*;

public class RotatingSchedule {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		Timer timer = new Timer(true);
		
		Calendar cal = Calendar.getInstance();
		cal.set(2017, Calendar.MAY, 1, 15, 0);
		
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("반복 타이머"+new Date());
			}
		}, cal.getTime(), TimeUnit.MINUTES.toMillis(1));
		
		TimeUnit.SECONDS.sleep(5);
	}

}







