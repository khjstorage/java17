package FormatterClass;

import java.text.*;
import java.util.*;

public class DecimalTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int radius;
		double area, circumference;
		
		Scanner scan = new Scanner(System.in);
		
		//���� �������� �Է¹޴´�.
		System.out.println("���� �������� �Է��ϼ���.");
		radius = scan.nextInt();
		
		// ���� ���� : �������� ����*����
		area = Math.PI*Math.pow(radius,2);
		
		//���� ���� : ����*����
		circumference = 2*Math.PI*radius;
		
		System.out.println("���� ���� : "+area);
		System.out.println("���� ���� : "+circumference);
		System.out.println();
		
		DecimalFormat fmt = new DecimalFormat("0.###");
		System.out.println("Format ���� �� (0.###)");
		System.out.println("���� ����(Format ����) : "+fmt.format(area));
		System.out.println("���� ����(Format ����) : "+fmt.format(circumference));
		System.out.println();
		
		fmt.applyPattern("00.#");
		System.out.println("���� ����(Format ����) : "+fmt.format(area));
		System.out.println("���� ����(Format ����) : "+fmt.format(circumference));
	}

}










