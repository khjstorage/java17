package StringPattern;

import java.util.Calendar;
import java.util.Scanner;

public class PersonIDCheck {
	
	public boolean getCheck(String x){
		int y[] ={2, 3, 4, 5, 6, 7, 0, 8, 9, 2, 3, 4, 5};
		int sum = 0;
		
		for(int i=0;i<13;i++){
			if(x.charAt(i)=='-')
				continue;
			
			sum +=(x.charAt(i)-48)*y[i];
		}
		System.out.println("sum :  "+sum);	//  주민번호 계산한 최종값.
		
		int temp = 11*(sum/11)+11-sum;
		int re = temp-10*(temp/10);
		
		boolean check = false;
		if(re == x.charAt(13)-48)
			check = true;
		
		return check;
	}
	
	public void output(String x){
		if(!getCheck(x)){
			System.out.println("유효하지 않음");
			return;
		}else
			System.out.println("유효한 주민등록 번호입니다.");
		
		int birth = 0;
		int yy = 0;
		int mm = 0;
		int dd = 0;
		
		if(x.charAt(7)-48<3)
			birth = 1900;
		else
			birth = 2000;
		
		yy = Integer.parseInt(x.substring(0,2));
		mm = Integer.parseInt(x.substring(2,4));
		dd =  Integer.parseInt(x.substring(4,6));
		System.out.println("생년월일 : "+(yy+birth)+"-"+mm+"-"+dd);
		
		Calendar cal = Calendar.getInstance();
		int current_yaer = cal.get(Calendar.YEAR);
		
		int y = Integer.parseInt(x.substring(0,2));
		
		if(x.charAt(7)-48<3)
			y+=1900;
		else
			y+=2000;
		
		System.out.println("\nAge : "+(current_yaer-y));	// 나이 계산해서 출력
		System.out.print("\n Sex : ");
		if((x.charAt(7)-48)%2==0)
			System.out.println("여성");
		else
			System.out.println("남성");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호 입력(예:071218-3444444) >> ");
		String rd = sc.next();
		
		new PersonIDCheck().output(rd);
		System.out.println("System.ended");
		
	}

}






