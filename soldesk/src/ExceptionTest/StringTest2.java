package ExceptionTest;

public class StringTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "����Ŭ�ڹ� ";
		String str2 = "ä��Ȯ�� ������";
		String str3;
		
		System.out.println("���ڿ� ��(1) : "+str1.equals(str2));
		System.out.println("���ڿ� ��(1) : "+"Hello".equals("hello"));
		System.out.println("���� ���ڿ� ��ҹ��� ���о��� �� : "+"Hello".equalsIgnoreCase("hello"));
		
		String s1 = new String("abcd");
		String s2 = new String("abcd");
	
		
		System.out.println(" == ������ : "+(s1==s2));
		System.out.println(" equals �޼ҵ� : "+s1.equals(s2));
		System.out.println(" intern �޼ҵ� : "+(s1.intern() == s2.intern()));  // ��ü�� �޼ҵ� �ּҰ����� ��
		
		str3 = str1+str2;
		System.out.println(str3);
		
		str3 = str1.concat(str2);	// ���ڿ� ���� �޼ҵ� : concat()
		System.out.println(str3);
		
		System.out.println("���ڿ��� ���� : "+str3.length());
		
		System.out.println("�����ڷ� �������� ���� : "+str3.endsWith("������"));	// ������ ���ڿ��� �������� Ȯ��
		
		System.out.println("3��°  �ִ� ���� : "+str3.charAt(3));
		str3 = str3.replaceAll(" ", ", ");		// Ư�� ���ڿ� ��� ��ü�ϴ� �޼ҵ�
		System.out.println(str3);
		
		System.out.println("3~9��°������ ���ڿ�  : "+str3.substring(3, 10));
		System.out.println("ã�� ���ڿ� : ä��Ȯ���� :"
				+((str3.lastIndexOf("ä��Ȯ����") == -1) ? "��ã����" : "ã����"));
		
		String str4 = " ����Ŭ �ڹ� ������ ";
		System.out.println(str4.trim());
	}

}




