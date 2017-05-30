package ThreadTest;

import java.util.*;
import java.util.concurrent.locks.*;

public class LockCondition {
	private final Lock lock = new ReentrantLock();
	private final Condition condition = lock.newCondition();
	
	List<String> pool = new LinkedList<String>(
			Arrays.asList("one", "two","three", "four", "five"));
	
	public String get() throws InterruptedException{
		try{
			lock.lock();
			
			while(pool.size()==0){
				condition.await();		// List�� ��� ������ ���
			}
			
			return pool.remove(0);
		}finally{
			lock.unlock();
		}
	}
	
	public void add(String value){
		try{
			lock.lock();
			
			pool.add(value);
			
			condition.signalAll();
		}finally{
			lock.unlock();
		}
	}

}










