package FormatterClass;

import java.util.*;

public class CalendarTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		Calendar cal1 = new GregorianCalendar();
		GregorianCalendar gc = new GregorianCalendar();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int day_of_year = cal.get(Calendar.DAY_OF_YEAR);	// �� ���� ����
		int ampm = cal.get(Calendar.AM_PM);
		int day_of_week = cal.get(Calendar.DAY_OF_WEEK);
		
		String[] week_title = {"��", "��", "ȭ", "��", "��", "��", "��"};
		
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println(year + " / " +month+ " / " +day+ " / "
				+ day_of_year+ " / "+ ((ampm==0)?"����":"����")+" / "
				+ week_title[day_of_week-1]+" / "+hour+ ":" +minute+ ":" +second);
		
		int temp_year = 2017;
		System.out.println(temp_year+"���� "+ (gc.isLeapYear(temp_year)?"����":"���"));
		
	}

}











