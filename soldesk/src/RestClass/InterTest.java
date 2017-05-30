package RestClass;

class InterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone sp = null;
		
		sp = new Android();
		sp.map();
		sp.nfc();
		System.out.println("-------------------------------");
		sp = new IPhone();
		sp.map();
		sp.nfc();
	}

}
