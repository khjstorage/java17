package ThreadTest;

import java.util.*;
import java.util.concurrent.*;

public class SchExecutorTest {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		/*���� �ð� �Ŀ� �۾��� ������ �� �ְ� �����ٸ�*/
		{
			// �۾��� �����ٸ� �� �� �ִ� ScheduledExecutorService�� ����
			ScheduledExecutorService exectService = Executors.newSingleThreadScheduledExecutor();
			
			// 3�� �Ŀ� �½�ũ�� ����
			exectService.schedule(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					System.out.println("Executed");
				}
			}, 3000, TimeUnit.MILLISECONDS);
			
			//��� �۾��� ����Ǹ� ScheduledExecutorService�� �˴ٿ��ؾ� ��.
			exectService.shutdown();
		}
		
		/* ������ �������� �۾��� ������ �� �ֵ��� �����ٸ� */
		{
			// �۾��� �����ٸ� �� �� �ִ� ScheduledExecutorService�� ����
			ScheduledExecutorService exectService = Executors.newSingleThreadScheduledExecutor();
			
			//1�� �ķκ��� 3�� �������� �۾��� ����
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









