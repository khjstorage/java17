package ExceptionTest;

class yPoint implements Cloneable{
	int x;
	int y;
	
	yPoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString(){
		return "x="+x+", y="+y;
	}
	
	public Object clone(){
		Object obj = null;
		
		try{
			obj = super.clone();
		}catch(CloneNotSupportedException ex){
			
		}
		
		return obj;
	}
}

public class CloneTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		yPoint original = new yPoint(3,5);
		yPoint copy = (yPoint)original.clone();
		
		System.out.println(original);
		System.out.println(copy);
		System.out.println(original==copy);
	}

}




