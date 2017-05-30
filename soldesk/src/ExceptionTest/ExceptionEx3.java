package ExceptionTest;

public class ExceptionEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		System.out.println(2);
		
		try{
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		}catch(ArithmeticException e){
			if(e instanceof ArithmeticException)
				System.out.println("true");
			System.out.println("ArithmeticException");
		}catch(Exception ae){
			System.out.println("Exception");
		}
		
		System.out.println(6);
	}

}


