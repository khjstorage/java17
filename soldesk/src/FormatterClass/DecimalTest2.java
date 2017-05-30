package FormatterClass;

import java.text.*;
import java.util.*;

public class DecimalTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int radius;
		double area, circumference;
		
		Scanner scan = new Scanner(System.in);
		
		//원의 반지름을 입력받는다.
		System.out.println("원의 반지름을 입력하세요.");
		radius = scan.nextInt();
		
		// 원의 넓이 : 반지름의 제곱*파이
		area = Math.PI*Math.pow(radius,2);
		
		//원의 길이 : 지름*파이
		circumference = 2*Math.PI*radius;
		
		System.out.println("원의 넓이 : "+area);
		System.out.println("원의 길이 : "+circumference);
		System.out.println();
		
		DecimalFormat fmt = new DecimalFormat("0.###");
		System.out.println("Format 적용 후 (0.###)");
		System.out.println("원의 넓이(Format 적용) : "+fmt.format(area));
		System.out.println("원의 길이(Format 적용) : "+fmt.format(circumference));
		System.out.println();
		
		fmt.applyPattern("00.#");
		System.out.println("원의 넓이(Format 적용) : "+fmt.format(area));
		System.out.println("원의 길이(Format 적용) : "+fmt.format(circumference));
	}

}










