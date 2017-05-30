package FormatterClass;

import java.time.*;
import java.time.temporal.*;

public class TimeTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today = LocalDate.now();		// 오늘의 날짜
		LocalTime now = LocalTime.now();		// 현재 시간
		
		LocalDate birthDate = LocalDate.of(1999, 12, 31);	//1999년 12월 31일
		LocalTime birthTime = LocalTime.of(23, 59, 59);		// 23시 59분 59분
		
		System.out.println("today="+today);
		System.out.println("now="+now);
		System.out.println("birthDate="+birthDate);
		System.out.println("birthTime="+birthTime);
		
		System.out.println(birthDate.withYear(2000));  //2000-12-31
		System.out.println(birthDate.plusMonths(2));		//2000-01-01
		
//		System.out.println(birthDate.plusDays(1));		//2000-01-01
		System.out.println(birthTime.truncatedTo(ChronoUnit.HOURS));		//23:00
		
		System.out.println("-------------날짜테스트 결과-------------");
		LocalDate tomorrow = today.plus(1, ChronoUnit.DAYS);
		LocalDate yesterday = today.minusDays(1);
		
		System.out.println("tomorrow : "+tomorrow);
		System.out.println("yesterday : "+yesterday);
		
		System.out.println("--------- 세계의 시간 가져오기 ----------");
		ZoneId zone1 = ZoneId.of("Europe/Berlin");
		LocalTime now1 = LocalTime.now(zone1);
		
		System.out.println("zone1:"+now1);
	}

}







