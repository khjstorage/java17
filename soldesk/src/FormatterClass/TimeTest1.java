package FormatterClass;

import java.time.*;
import java.time.temporal.*;

public class TimeTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today = LocalDate.now();		// ������ ��¥
		LocalTime now = LocalTime.now();		// ���� �ð�
		
		LocalDate birthDate = LocalDate.of(1999, 12, 31);	//1999�� 12�� 31��
		LocalTime birthTime = LocalTime.of(23, 59, 59);		// 23�� 59�� 59��
		
		System.out.println("today="+today);
		System.out.println("now="+now);
		System.out.println("birthDate="+birthDate);
		System.out.println("birthTime="+birthTime);
		
		System.out.println(birthDate.withYear(2000));  //2000-12-31
		System.out.println(birthDate.plusMonths(2));		//2000-01-01
		
//		System.out.println(birthDate.plusDays(1));		//2000-01-01
		System.out.println(birthTime.truncatedTo(ChronoUnit.HOURS));		//23:00
		
		System.out.println("-------------��¥�׽�Ʈ ���-------------");
		LocalDate tomorrow = today.plus(1, ChronoUnit.DAYS);
		LocalDate yesterday = today.minusDays(1);
		
		System.out.println("tomorrow : "+tomorrow);
		System.out.println("yesterday : "+yesterday);
		
		System.out.println("--------- ������ �ð� �������� ----------");
		ZoneId zone1 = ZoneId.of("Europe/Berlin");
		LocalTime now1 = LocalTime.now(zone1);
		
		System.out.println("zone1:"+now1);
	}

}







