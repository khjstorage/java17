package StringPattern;

public class IntegerExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("10에 대한 비트 수 ? "+ Integer.bitCount(10));
		
		int n = 1023;
		System.out.println(n+"의 바이너리 값 : "+Integer.toBinaryString(n));
		System.out.println(n+"의 8진법 값 : "+Integer.toOctalString(n));
		System.out.println(n+"의 16진법 값 : "+Integer.toHexString(n));
		
		int ib = Integer.parseInt("11110010", 2);		// 이진수->십진수 정수형태 데이타 변환
		int ic = Integer.parseInt("1ab3f", 16);			// 16진수 -> 십진수 정수형 데이타로 변환
		
		System.out.println("ib(2진수) : "+ib);
		System.out.println("ic(16진수) : "+ic);
	}

}






