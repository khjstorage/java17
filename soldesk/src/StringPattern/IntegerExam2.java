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
			System.out.println("�����ϴ�.");
		else
			System.out.println("�ٸ��ϴ�.");
		
		String data = "";
		Scanner rd = new Scanner(System.in);
		System.out.print("���ĺ� ���ڿ� �Է� >> ");
		String re = rd.next();
		System.out.println("Source Data : "+re);
		
		// �빮��->�ҹ���, �ҹ���->�빮�ڷ� ����
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






