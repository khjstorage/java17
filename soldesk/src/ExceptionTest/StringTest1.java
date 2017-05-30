package ExceptionTest;

import java.util.StringJoiner;

public class StringTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "abc";
		String str2 = "abc";
		
		System.out.println("String str1 = \"abc\" ; ");
		System.out.println("String str2 = \"abc\" ; ");
		
		System.out.println("str1 == str2 ? "+(str1==str2));
		System.out.println("str1.equals(str2) ? "+str1.equals(str2));
		System.out.println();
		
		String str3 = new String("\"abc\"");
		String str4 = new String("\"abc\"");
		
		System.out.println("String str3 = new String(\"abc\");");
		System.out.println("String str4 = new String(\"abc\");");
		
		System.out.println("str3 == str4 ? "+(str3==str4));
		System.out.println("str3.equals(str4) ? "+str3.equals(str4));
		
		String animals = "dog,cat,bear";
		String[] arr = animals.split(",");
		
		System.out.println(String.join("-", arr));
		StringJoiner sj = new StringJoiner("/","[","]");	// jdk 1.8 버전부터 새로 생김
		for(String s : arr)
			sj.add(s);
		System.out.println(sj.toString());
		
		int iVal = 100;
		String strVal = String.valueOf(iVal);
		
		double dVal = 200.0;
		String strVal2 = dVal + "";
		
		double sum = Integer.parseInt(strVal)+Double.parseDouble(strVal2);
		double sum2 = Integer.valueOf(strVal)+Double.valueOf(strVal2);
		
		System.out.println(String.join("", strVal, "+", strVal2,"=")+sum);
		System.out.println(strVal+"+"+strVal2+"="+sum2);
	}

}





