package ThreadTest;

import java.util.*;

public class JavaBakeryStore {
	private Vector<String> baker;
	
	public JavaBakeryStore(){
		baker = new Vector<String>();
	}
	
	public synchronized void getBaker(Customer custmoer){
		String bakerName = "";
		
		while(baker.size()==0){
			try{
				wait();
			}catch(InterruptedException iex){
				iex.printStackTrace();
			}
		}
		
		bakerName = baker.remove(0);
		System.out.println(custmoer.name+" ¥‘¿Ã "+ bakerName +" ªß¿ª ±∏¿‘«œºÃΩ¿¥œ¥Ÿ.");
		
		try{
			Thread.currentThread().sleep(500);
		}catch(InterruptedException iex){
			iex.printStackTrace();
		}
		
		notifyAll();
	}
	
	public synchronized void putBaker(String bakerName){
		while(baker.size()==3){
			try{
				wait();
			}catch(InterruptedException iex){
				iex.printStackTrace();
			}
		}
		
		baker.add(bakerName);
		System.out.println(bakerName + " ªß¿Ã ¿‘∞Ì µ«æ˙Ω¿¥œ¥Ÿ.");
		
		try{
			Thread.currentThread().sleep(500);
		}catch(InterruptedException iex){
			iex.printStackTrace();
		}
		
		notifyAll();
	}
}








