package ThreadTest;

public class Customer extends Thread {
	public String name;
	
	public JavaBakeryStore shareData;
	
	public Customer(String name, JavaBakeryStore shareData){
		this.name = name;
		this.shareData = shareData;
	}
	
	public void run(){
		for(int i=0;i<20;i++){
			shareData.getBaker(this);
		}
	}
}





