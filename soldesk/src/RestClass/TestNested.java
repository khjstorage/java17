package RestClass;

public class TestNested {
	int i;
	static int j;
	
	public TestNested(){
		System.out.println("Outer 클래스의 생성자");
	}
	
	public void outMethod(){
		System.out.println("인스턴스 메소드");
	}
	
	public static void outStaticMethod(){
		System.out.println("Outer 클래스의 static 메서드");
	}
	
	/* 중첩클래스의 시작 */
	static class Nested{
		static int k;
		
		public Nested(){
			System.out.println("Inner 생성자");
		}
		
		public static void inMethod(){
//			i = 10;	// static 영역에서는 instance 영역의 자원을 사용할 수 없음
			System.out.println("Inner 메서드");
			TestNested.j = 10;
//			outMethod()	// static 영역에서는 instance 영역의 자원을 사용할 수 없음
			TestNested.outStaticMethod();
		}
	}// 중첩 클래스의 end

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nested.k = 10;
		Nested.inMethod();
	}

}




