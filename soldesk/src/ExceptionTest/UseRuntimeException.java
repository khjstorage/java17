package ExceptionTest;

import java.util.Scanner;

public class UseRuntimeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rd = new Scanner(System.in);
		
		try{
			System.out.print("숫자1 >> ");
			int num1 = rd.nextInt();
			
			System.out.print("숫자2 >> ");
			int num2 = rd.nextInt();
			int result = 0;
			
			result = num1/num2;
			System.out.println(num1+"/"+num2+"="+result);
		}catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("간단한 메시지 : "+ ex.getMessage());
			System.err.println("사용법) java UseRuntimeException n 값1 값2");
			System.err.println("예외처리클래스명과 메시지 : "+ex.toString());
			ex.printStackTrace();
		}catch(ArithmeticException ae){
			System.out.println("0으로 나눌 수 없습니다.");
		}catch(NumberFormatException nfe){
			System.err.println("숫자형식만 입력 가능");
		}catch(Exception e){
			System.err.println("개발자가 인식하지 못한 에러입니다.");
		}finally{
			System.out.println("사용해주셔서 감사합니다.");
		}
	}

}



