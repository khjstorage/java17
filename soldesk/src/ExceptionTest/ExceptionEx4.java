package ExceptionTest;

class Test{
	public void calc(int tot, int cnt) throws Exception{
		int avg = tot/cnt;
		System.out.println("avg : "+avg);
	}
	
	public void print(String name) throws Exception{
		System.out.println("Name : "+name.toUpperCase());
	}
}

public class ExceptionEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();
		
		try{
			test.calc(250, 0);
			test.print("JAVA");
		}catch(Exception e){
			System.out.println("예외발생 "+new java.util.Date().toLocaleString());
			e.printStackTrace();
		}finally{
			System.out.println("계속 실행합니다.");
		}
	}

}








