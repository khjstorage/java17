package StringPattern;

import java.util.regex.Pattern;

public class RegulraTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern = "^\\S+.(?i)(txt|pdf|hwp|xls)$";
		String input = "Java.jpg";
		
		String pattern2 = "(.+?)(\\.tar)?\\.gz$";
		String input2 = "libarary.tar.gz";
		
		vailPatteeren(pattern, input);
		vailPatteeren(pattern2, input2);
		
	}
	
	public static void vailPatteeren(String pattern, String input){
		boolean i = Pattern.matches(pattern, input);
		
		if(i){
			System.out.println(input+"�� ���Ͽ� ��ġ��.");
		}else
			System.out.println("���Ͽ� ��ġ���� ����.");
	}

}










