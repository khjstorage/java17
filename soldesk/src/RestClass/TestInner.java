package RestClass;

public class TestInner {
	int i;
	
	public TestInner(){
		System.out.println("Outer Ŭ���� ������");
	}
	
	public void outMehtod(){
		System.out.println("Outer Ŭ������ �޼���");
	}
	
	// Inner class
	public class Inner{
		int j;
		
		public Inner(){
			System.out.println("Inner Ŭ���� ������");
		}
		
		public void inMethod(){
			System.out.println("Inner Ŭ������ �޼���");
			System.out.println("Inner �޼��� Outer ���� i="+i);
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



