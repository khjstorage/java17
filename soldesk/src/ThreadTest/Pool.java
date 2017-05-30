package ThreadTest;

import java.util.*;

public class Pool {
	List<String> pool = new LinkedList<String>(
			Arrays.asList("one", "two", "three", "four", "five"));
	
	public synchronized String get() throws InterruptedException{
		//List �� ��� �ִ� ���
		while(pool.size()==0){
			//notifyAll() �޼��尡 ����� ������ ���
			wait();
		}
		
		return pool.remove(0);
	}
	
	public synchronized void add(String value){
		pool.add(value);
		
		notifyAll();
	}
	
}







