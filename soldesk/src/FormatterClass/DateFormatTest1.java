package FormatterClass;

import java.text.SimpleDateFormat;
import java.util.*;

public class DateFormatTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date today = new Date();
		SimpleDateFormat sf1, sf2, sf3, sf4, sf5, sf6,sf7, sf8, sf9;
		
		sf1 = new SimpleDateFormat("yyyy-MM-dd");
		sf2 = new SimpleDateFormat("''yy년 MMM dd일 E요일");
		sf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		sf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		sf5 = new SimpleDateFormat("오늘은 올 해의 D번째 날입니다.");
		sf6 = new SimpleDateFormat("오늘은 이 달의 d번째 날입니다.");
		sf7 = new SimpleDateFormat("오늘은 올 해의 w번째 주입니다.");
		sf8 = new SimpleDateFormat("오늘은 이 달의 W번째 주입니다.");
		sf9 = new SimpleDateFormat("오늘은 이 달의 F번째 E요일입니다.");
		
		System.out.println(sf1.format(today));
		System.out.println(sf2.format(today));
		System.out.println(sf3.format(today));
		System.out.println(sf4.format(today));
		System.out.println();
		System.out.println(sf5.format(today));
		System.out.println(sf6.format(today));
		System.out.println(sf7.format(today));
		System.out.println(sf8.format(today));
		System.out.println(sf9.format(today));
	}

}








