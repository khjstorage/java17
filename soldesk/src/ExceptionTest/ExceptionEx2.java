package ExceptionTest;

import java.util.Scanner;

public class ExceptionEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rd = new Scanner(System.in);
		
		try{
			System.out.print("������ >> ");
			int tot = rd.nextInt();
			
			System.out.print("������� >> ");
			int cnt = rd.nextInt();
			
			int avg = tot/cnt;
			System.out.println("���� : "+tot);
			System.out.println("����� : "+cnt);
			System.out.println("��� : "+avg);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("���� �����մϴ�.");
			rd.close();
		}
		
		System.out.println("���� ������ ��� �����մϴ�.");
	}

}





