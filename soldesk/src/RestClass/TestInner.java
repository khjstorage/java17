package RestClass;

public class TestInner {
	int i;
	
	public TestInner(){
		System.out.println("Outer 클래스 생성자");
	}
	
	public void outMehtod(){
		System.out.println("Outer 클래스의 메서드");
	}
	
	// Inner class
	public class Inner{
		int j;
		
		public Inner(){
			System.out.println("Inner 클래스 생성자");
		}
		
		public void inMethod(){
			System.out.println("Inner 클래스의 메서드");
			System.out.println("Inner 메서드 Outer 변수 i="+i);
		}
	}//Inner class end

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestInner ti = new TestInner();
		ti.i = 10;
		TestInner.Inner in = ti.new Inner();
		in.j = 10;
		in.inMethod();
	}

}



