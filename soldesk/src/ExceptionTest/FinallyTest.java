package ExceptionTest;

public class FinallyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinallyTest.method1();
		System.out.println("method1()�� �����ϰ� main �޼���� ���ƿԽ��ϴ�.");
	}
	
	public static void method1(){
		try{
			System.out.println("method1()�� ȣ��Ǿ����ϴ�.");
			return;
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("method1()�� finally ���� ����Ǿ����ϴ�.");
		}
	}

}
