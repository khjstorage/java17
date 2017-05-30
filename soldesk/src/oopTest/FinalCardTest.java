package oopTest;

class ACard{
	final int NUMBER;
	final String KIND;
	static int width = 100;
	static int height = 250;
	
	ACard(String kind, int num){
		KIND = kind;
		NUMBER = num;
	}
	
	ACard(){
		this("HEART",1);
	}

	@Override
	public String toString() {
		return KIND + " "+ NUMBER;
	}
	
}

class FinalCardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ACard c = new ACard("HEART",10);
		
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c);
	}

}








