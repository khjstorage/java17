package StringPattern;

public class IntegerExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("10�� ���� ��Ʈ �� ? "+ Integer.bitCount(10));
		
		int n = 1023;
		System.out.println(n+"�� ���̳ʸ� �� : "+Integer.toBinaryString(n));
		System.out.println(n+"�� 8���� �� : "+Integer.toOctalString(n));
		System.out.println(n+"�� 16���� �� : "+Integer.toHexString(n));
		
		int ib = Integer.parseInt("11110010", 2);		// ������->������ �������� ����Ÿ ��ȯ
		int ic = Integer.parseInt("1ab3f", 16);			// 16���� -> ������ ������ ����Ÿ�� ��ȯ
		
		System.out.println("ib(2����) : "+ib);
		System.out.println("ic(16����) : "+ic);
	}

}






