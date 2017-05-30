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
		System.out.println("sum :  "+sum);	//  �ֹι�ȣ ����� ������.
		
		int temp = 11*(sum/11)+11-sum;
		int re = temp-10*(temp/10);
		
		boolean check = false;
		if(re == x.charAt(13)-48)
			check = true;
		
		return check;
	}
	
	public void output(String x){
		if(!getCheck(x)){
			System.out.println("��ȿ���� ����");
			return;
		}else
			System.out.println("��ȿ�� �ֹε�� ��ȣ�Դϴ�.");
		
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
		System.out.println("������� : "+(yy+birth)+"-"+mm+"-"+dd);
		
		Calendar cal = Calendar.getInstance();
		int current_yaer = cal.get(Calendar.YEAR);
		
		int y = Integer.parseInt(x.substring(0,2));
		
		if(x.charAt(7)-48<3)
			y+=1900;
		else
			y+=2000;
		
		System.out.println("\nAge : "+(current_yaer-y));	// ���� ����ؼ� ���
		System.out.print("\n Sex : ");
		if((x.charAt(7)-48)%2==0)
			System.out.println("����");
		else
			System.out.println("����");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹε�Ϲ�ȣ �Է�(��:071218-3444444) >> ");
		String rd = sc.next();
		
		new PersonIDCheck().output(rd);
		System.out.println("System.ended");
		
	}

}






