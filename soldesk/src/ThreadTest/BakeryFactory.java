package ThreadTest;

public class BakeryFactory extends Thread {
	public String name;
	public JavaBakeryStore shareData;
	
	public BakeryFactory(String name, JavaBakeryStore shareData){
		this.name = name;
		this.shareData = shareData;
	}
	
	public void run(){
		for(int i=0; i<20; i++){
			shareData.putBaker("»§_"+i);
		}
	}
}
