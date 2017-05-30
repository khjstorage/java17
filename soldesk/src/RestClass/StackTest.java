package RestClass;

import java.util.Scanner;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rd = new Scanner(System.in);
		StringStack s = new StringStack();
		
		System.out.println("입력하세요. >> ");
		String str = rd.next();
		
		s.push(str);
		System.out.println("출력 결과 >> "+ s.pop());
		System.out.println("길이 >> "+s.length());
	}

}
