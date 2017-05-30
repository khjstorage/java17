package StringPattern;

import java.util.*;
import java.util.regex.*;

public class RegularTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p = Pattern.compile("(^[0-9]*$)");
		int onlyNum;
		String inputVal;
		Scanner iStream = new Scanner(System.in);
		
		System.out.print("데이타를 입력해주세요. >> ");
		inputVal = iStream.nextLine();
		Matcher m = p.matcher(inputVal);
		
		if(m.find()){
			onlyNum = Integer.parseInt(inputVal);
			System.out.println(onlyNum);
		}else
			System.out.println("숫자가 아닙니다.");
	}

}






