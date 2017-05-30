package ExceptionTest;

public class FinallyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinallyTest.method1();
		System.out.println("method1()을 수행하고 main 메서드로 돌아왔습니다.");
	}
	
	public static void method1(){
		try{
			System.out.println("method1()이 호출되었습니다.");
			return;
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("method1()의 finally 블럭이 실행되었습니다.");
		}
	}

}
