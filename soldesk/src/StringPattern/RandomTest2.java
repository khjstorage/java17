package StringPattern;

import java.util.*;

public class RandomTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		int i = rnd.nextInt();
		System.out.println("정수 난수 : "+i);
		
		System.out.println("정수 난수(i%10) : "+(i%10));
		System.out.println("정수 난수 : "+ Math.abs(i%10));
		
		int j = rnd.nextInt(10);
		System.out.println("nextInt(10) = "+j);
		
		float f = rnd.nextFloat();
		double d = rnd.nextDouble();
		System.out.println("float 난수 : "+f);
		System.out.println("double 난수 : "+d);
		
		System.out.println("double 난수 범위: "+d*10);
		System.out.println("double 난수 범위(정수만 출력): "+(int)(d*10));
		System.out.println("Boolean 난수 : "+rnd.nextBoolean());
	}

}









