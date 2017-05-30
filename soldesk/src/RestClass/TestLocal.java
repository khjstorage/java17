package RestClass;

public class TestLocal {
	int out_i;
	
	public TestLocal(){
		System.out.println("Outer Class의 생성자");
	}
	
	public void method(int param_i, final int param_j){
		int local_i = 0;
		final int local_j = 0;
		
		//Local class 시작
		class Local{
			int i;
			
			public Local(){
				System.out.println("Local class의 생성자");
			}
			
			public void localMethod(){
				System.out.println("Outer 클래스의 인스턴스 변수"+out_i);
				System.out.println("파라메터 param_j : "+param_j);
				System.out.println("파라메터 param_i : "+param_i);
				
				System.out.println("지역변수 local_i : "+local_i);
				System.out.println("지역변수 local_j : "+local_j);
				System.out.println("지역클래스의 메서드");
			}
		}//Local class end
		
		Local local = new Local();
		local.i = 10;
		local.localMethod();
	}// method end

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestLocal tl = new TestLocal();
		tl.method(100, 200);
	}

}







