package FormatterClass;

import java.util.*;

public class CalendarTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("2014. 5. 1 - 2014. 4. 28: "+ dayDiff(2014, 5,1, 2014, 4, 28));
		System.out.println("2014. 5. 31 :" + getDayOfWeek(2014, 5, 31));
		System.out.println("2012. 6. 1 :" + getDayOfWeek(2012, 6, 1));
		System.out.println("2015. 6. 29 :" + convertDatetoDay(2015, 6, 29));
		System.out.println("735778 : "+ convertDayToDate(735778));
	}
	
	public static int[] endOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	//  각 달의 윤년 계산
	public static boolean isLeapYear(int year){
		return ((year%4==0) && (year%100!=0) || (year%400==0));
	}
	
	// 두 날짜간의 차이를 계산해서 일단위로 반환
	public static int dayDiff(int y1, int m1, int d1, int y2, int m2, int d2){
		return convertDatetoDay(y1, m1, d1) - convertDatetoDay(y2, m2, d2);
	}
	
	// 일 단위의 값을 년월일의 형태의 문자열로 반환
	public static String convertDayToDate(int day){
		int year = 1;
		int month = 0;
		int numOfLeapYear = 0;
		
		while(true){
			int aYear = isLeapYear(year) ? 366 : 365;
			if(day > aYear){
				day -=aYear;
				year++;
			}else{
				break;
			}
		}
		
		while(true)
		{
			int endDay = endOfMonth[month];
			
			if(isLeapYear(year) && month==1) endDay++;
			
			if(day>endDay){
				day-=endDay;
				month++;
			}else{
				break;
			}
		}
		
		return year+"-"+(month+1)+"-"+day;
	}
	
	// 년월일로 입력받아서 일단위로 변환
	public static int convertDatetoDay(int year, int month, int day){
		int numOfLeapYear = 0; // 윤년의 수
		
		// 전년도까지의 윤년의 수 구하기
		for(int i=1;i<year;i++){
			if(isLeapYear(i))
				numOfLeapYear++;
		}
		
		//전년도까지의 일 수를 구한다.
		int toLastYearDaySum = (year-1)*365+numOfLeapYear;
		
		// 올해의 현재 월까지의 일수 계산
		int thisYearDaySum = 0;
		
		for(int i=0;i<month-1;i++){
			thisYearDaySum +=endOfMonth[i];
		}
		
		if(month>2 && isLeapYear(year))
			thisYearDaySum ++;
		
		thisYearDaySum +=day;
		
		return toLastYearDaySum+thisYearDaySum;
	}
	
	// 지정한 날짜의 요일을 반환(1~7 1이 일요일임)
	public static int getDayOfWeek(int year, int month, int day){
		return convertDatetoDay(year, month, day)%7 + 1;
	}
}









