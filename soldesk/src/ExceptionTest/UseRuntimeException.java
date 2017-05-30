package ExceptionTest;

import java.util.Scanner;

public class UseRuntimeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rd = new Scanner(System.in);
		
		try{
			System.out.print("����1 >> ");
			int num1 = rd.nextInt();
			
			System.out.print("����2 >> ");
			int num2 = rd.nextInt();
			int result = 0;
			
			result = num1/num2;
			System.out.println(num1+"/"+num2+"="+result);
		}catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("������ �޽��� : "+ ex.getMessage());
			System.err.println("����) java UseRuntimeException n ��1 ��2");
			System.err.println("����ó��Ŭ������� �޽��� : "+ex.toString());
			ex.printStackTrace();
		}catch(ArithmeticException ae){
			System.out.println("0���� ���� �� �����ϴ�.");
		}catch(NumberFormatException nfe){
			System.err.println("�������ĸ� �Է� ����");
		}catch(Exception e){
			System.err.println("�����ڰ� �ν����� ���� �����Դϴ�.");
		}finally{
			System.out.println("������ּż� �����մϴ�.");
		}
	}

}



