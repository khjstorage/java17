package StringPattern;

import java.util.Scanner;

public class IntegerExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("int Max value : "+Integer.MAX_VALUE);
		System.out.println("int Min value : " + Integer.MIN_VALUE);
		
		Integer n = new Integer(10);
		int m = 10;
		
		if(n==m)
			System.out.println("같습니다.");
		else
			System.out.println("다릅니다.");
		
		String data = "";
		Scanner rd = new Scanner(System.in);
		System.out.print("알파벳 문자열 입력 >> ");
		String re = rd.next();
		System.out.println("Source Data : "+re);
		
		// 대문자->소문자, 소문자->대문자로 변경
		for(int i=0;i<re.length();i++){
			if(Character.isUpperCase(re.charAt(i)))
				data += Character.toLowerCase(re.charAt(i));
			else
				data += Character.toUpperCase(re.charAt(i));
		}
		
		System.out.println("Return Data : "+ data);
		
		String trimtest = "test                        ";
		System.out.println("trim test : "+trimtest.trim()+"value");
	}

}






