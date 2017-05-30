package ThreadTest;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//단일 쓰레드에서 실행되는 ExecutorService 생성
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		
		executorService.execute(new ThreadTest());
		executorService.execute(new ThreadTest());
		executorService.execute(new ThreadTest());
		
		executorService.shutdown();
	}

}







