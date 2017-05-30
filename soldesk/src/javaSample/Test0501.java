package javaSample;

import java.util.Scanner;

class Test0501 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1~99사이의 정수를 입력해주세요 >> ");
		
		Scanner rd = new Scanner(System.in);
		String game1 = rd.next();
		
		int num10, num1;
		
		boolean mul10 = false;		// 10의 자리가 3의 배수인지 판단
		boolean mul1 = false;		// 1의 자리가 3의 배수인지 판단
		
		if(game1.length()==2){
			num10 = game1.charAt(0) - '0';			
			num1 = game1.charAt(1) -'0';
			
			if(num10==3 || num10 ==6 || num10 ==9){
				mul10 = true;
			}
			
			if(num1==3 || num1==6 || num1==9){
				mul1 = true;
			}
		}else {
			num1 = game1.charAt(0)-'0';
			
			if(num1==3 || num1 ==6 || num1 ==9){
				mul10 = true;
			}
		}
		
		if(mul10 && mul1){
			System.out.println("박수짝짝");
		}else if(mul10 || mul1){
			System.out.println("박수짝");
		}

	}

}
