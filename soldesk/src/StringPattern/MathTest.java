package StringPattern;

import static java.lang.Math.*;
import static java.lang.System.*;

public class MathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double val = 90.7552;
		
		out.println("round("+val+")="+round(val));	//�ݿø�
		
		val *=100;
		out.println("round("+val+")="+round(val));	//�ݿø�
		out.println("round("+val+")/100 ="+round(val)/100);
		out.println("round("+val+")/100.0 ="+round(val)/100.0);
		out.printf("ceil(%3.1f)=%3.1f%n", 1.1, ceil(1.1));	// ������ �ø�
		out.printf("floor(%3.1f)=%3.1f%n", 1.5, floor(1.5));	// ������ ����
	}

}







