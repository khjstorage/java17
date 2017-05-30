package ExceptionTest;

import java.util.Scanner;

public class ExceptionEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rd = new Scanner(System.in);
		
		try{
			System.out.print("총점은 >> ");
			int tot = rd.nextInt();
			
			System.out.print("과목수는 >> ");
			int cnt = rd.nextInt();
			
			int avg = tot/cnt;
			System.out.println("총점 : "+tot);
			System.out.println("과목수 : "+cnt);
			System.out.println("평균 : "+avg);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("정상 진행합니다.");
			rd.close();
		}
		
		System.out.println("다음 로직을 계속 실행합니다.");
	}

}





