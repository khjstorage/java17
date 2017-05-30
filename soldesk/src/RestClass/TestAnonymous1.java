package RestClass;

class TestAnonymous1 {

	public void useFly(Fly f){
		System.out.println(f.speed());
		System.out.println(f.height());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestAnonymous1 ta = new TestAnonymous1();
		
		ta.useFly(new Fly() {
			
			@Override
			public String speed() {
				// TODO Auto-generated method stub
				return "속도";
			}
			
			@Override
			public String height() {
				// TODO Auto-generated method stub
				return "높이";
			}
		});
	}

}
