package StringPattern;

import java.util.*;

public class RandomTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		int i = rnd.nextInt();
		System.out.println("���� ���� : "+i);
		
		System.out.println("���� ����(i%10) : "+(i%10));
		System.out.println("���� ���� : "+ Math.abs(i%10));
		
		int j = rnd.nextInt(10);
		System.out.println("nextInt(10) = "+j);
		
		float f = rnd.nextFloat();
		double d = rnd.nextDouble();
		System.out.println("float ���� : "+f);
		System.out.println("double ���� : "+d);
		
		System.out.println("double ���� ����: "+d*10);
		System.out.println("double ���� ����(������ ���): "+(int)(d*10));
		System.out.println("Boolean ���� : "+rnd.nextBoolean());
	}

}









