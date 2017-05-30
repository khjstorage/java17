package ThreadTest;

import java.util.*;
import java.util.concurrent.*;

public class SchExecutorTest {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		/*지정 시간 후에 작업을 실행할 수 있게 스케줄링*/
		{
			// 작업을 스케줄링 할 수 있는 ScheduledExecutorService를 실행
			ScheduledExecutorService exectService = Executors.newSingleThreadScheduledExecutor();
			
			// 3초 후에 태스크를 실행
			exectService.schedule(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					System.out.println("Executed");
				}
			}, 3000, TimeUnit.MILLISECONDS);
			
			//모든 작업이 종료되면 ScheduledExecutorService를 셧다운해야 함.
			exectService.shutdown();
		}
		
		/* 지정된 간격으로 작업을 실행할 수 있도록 스케줄링 */
		{
			// 작업을 스케줄링 할 수 있는 ScheduledExecutorService를 실행
			ScheduledExecutorService exectService = Executors.newSingleThreadScheduledExecutor();
			
			//1초 후로부터 3초 간격으로 작업을 실행
			exectService.scheduleAtFixedRate(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					System.out.println("Rotating Executed"+new Date());
				}
			}, 1000, 3000, TimeUnit.MILLISECONDS);
			
			TimeUnit.MINUTES.sleep(1);
			
			exectService.shutdown();
		}
	}

}









