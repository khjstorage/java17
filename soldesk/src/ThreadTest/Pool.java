package ThreadTest;

import java.util.*;

public class Pool {
	List<String> pool = new LinkedList<String>(
			Arrays.asList("one", "two", "three", "four", "five"));
	
	public synchronized String get() throws InterruptedException{
		//List 가 비어 있는 경우
		while(pool.size()==0){
			//notifyAll() 메서드가 실행될 때까지 대기
			wait();
		}
		
		return pool.remove(0);
	}
	
	public synchronized void add(String value){
		pool.add(value);
		
		notifyAll();
	}
	
}







