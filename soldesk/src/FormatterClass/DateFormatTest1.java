package FormatterClass;

import java.text.SimpleDateFormat;
import java.util.*;

public class DateFormatTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date today = new Date();
		SimpleDateFormat sf1, sf2, sf3, sf4, sf5, sf6,sf7, sf8, sf9;
		
		sf1 = new SimpleDateFormat("yyyy-MM-dd");
		sf2 = new SimpleDateFormat("''yy�� MMM dd�� E����");
		sf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		sf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		sf5 = new SimpleDateFormat("������ �� ���� D��° ���Դϴ�.");
		sf6 = new SimpleDateFormat("������ �� ���� d��° ���Դϴ�.");
		sf7 = new SimpleDateFormat("������ �� ���� w��° ���Դϴ�.");
		sf8 = new SimpleDateFormat("������ �� ���� W��° ���Դϴ�.");
		sf9 = new SimpleDateFormat("������ �� ���� F��° E�����Դϴ�.");
		
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








