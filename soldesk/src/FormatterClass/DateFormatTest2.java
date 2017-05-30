package FormatterClass;

import java.util.*;
import java.text.*;

public class DateFormatTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat(
				"yyyy.MM.dd a hh(HH,kk):mm:ss EEEE", Locale.KOREA);
		SimpleDateFormat sdf1 = new SimpleDateFormat(
				"yyyy.MMMMM.dd GGG hh:mm a");
		
		System.out.println(sdf.format(date));
		System.out.println(sdf1.format(date));
	}

}



