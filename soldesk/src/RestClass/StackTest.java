package RestClass;

import java.util.Scanner;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rd = new Scanner(System.in);
		StringStack s = new StringStack();
		
		System.out.println("�Է��ϼ���. >> ");
		String str = rd.next();
		
		s.push(str);
		System.out.println("��� ��� >> "+ s.pop());
		System.out.println("���� >> "+s.length());
	}

}
