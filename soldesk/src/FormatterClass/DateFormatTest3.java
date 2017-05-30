package FormatterClass;

import java.util.*;
import java.text.*;

public class DateFormatTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat dateForm = new SimpleDateFormat("yyyy-MM-dd");
		Calendar aDate = Calendar.getInstance();
		
		aDate.set(2001, 0, 1);
		Calendar bDate = Calendar.getInstance();
		aDate.set(Calendar.HOUR_OF_DAY,0);
		aDate.set(Calendar.MINUTE, 0);
		aDate.set(Calendar.SECOND, 0);
		aDate.set(Calendar.MILLISECOND, 0);
		bDate.set(Calendar.HOUR_OF_DAY,0);
		bDate.set(Calendar.MINUTE, 0);
		bDate.set(Calendar.SECOND, 0);
		bDate.set(Calendar.MILLISECOND, 0);
		
		if(aDate.after(bDate))
			System.out.println("시스템 날짜보다 뒤일 경우 aDate = "+dateForm.format(aDate.getTime()));
		else if(aDate.before(bDate))
			System.out.println("시스템 날짜보다 앞일 경우 aDate = "+dateForm.format(aDate.getTime()));
		else
			System.out.println("날짜가 같네요.");
		
	}

}








