package StringPattern;

import java.util.StringTokenizer;

public class StringTokenizerTest2 {
	public StringTokenizerTest2(){
		String msg = "��浿, �����, �ڱ浿, ������, �̱���, ������";
		StringTokenizer stk = new StringTokenizer(msg, ",. ��", true);
		System.out.println("��ū�� ���� : "+stk.countTokens());
		
		while(stk.hasMoreTokens()){
			System.out.println(stk.nextToken());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new StringTokenizerTest2();
	}

}



