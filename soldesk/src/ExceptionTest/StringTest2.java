package ExceptionTest;

public class StringTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "오라클자바 ";
		String str2 = "채용확정 개발자";
		String str3;
		
		System.out.println("문자열 비교(1) : "+str1.equals(str2));
		System.out.println("문자열 비교(1) : "+"Hello".equals("hello"));
		System.out.println("영문 문자열 대소문자 구분없이 비교 : "+"Hello".equalsIgnoreCase("hello"));
		
		String s1 = new String("abcd");
		String s2 = new String("abcd");
	
		
		System.out.println(" == 연산자 : "+(s1==s2));
		System.out.println(" equals 메소드 : "+s1.equals(s2));
		System.out.println(" intern 메소드 : "+(s1.intern() == s2.intern()));  // 객체의 메소드 주소값끼리 비교
		
		str3 = str1+str2;
		System.out.println(str3);
		
		str3 = str1.concat(str2);	// 문자열 병합 메소드 : concat()
		System.out.println(str3);
		
		System.out.println("문자열의 길이 : "+str3.length());
		
		System.out.println("개발자로 끝나는지 여부 : "+str3.endsWith("개발자"));	// 지정된 문자열로 끝나는지 확인
		
		System.out.println("3번째  있는 문자 : "+str3.charAt(3));
		str3 = str3.replaceAll(" ", ", ");		// 특정 문자열 모두 교체하는 메소드
		System.out.println(str3);
		
		System.out.println("3~9번째까지의 문자열  : "+str3.substring(3, 10));
		System.out.println("찾을 문자열 : 채용확정자 :"
				+((str3.lastIndexOf("채용확정자") == -1) ? "못찾았음" : "찾았음"));
		
		String str4 = " 오라클 자바 개발자 ";
		System.out.println(str4.trim());
	}

}




