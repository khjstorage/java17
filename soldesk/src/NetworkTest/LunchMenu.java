package NetworkTest;

import java.util.Random;

public class LunchMenu {
	private static final String[] LUNCH ={
		"±èÄ¡Âî°³", "Â¥Àå¸é", "³Ã¸é", "µ·±î½º", "µÈÀåÂî°³", "°¨ÀÚÅÁ", "¼øµÎºÎÂî°³", "Â«»Í", "ººÀ½¹ä", "ºÒ°í±â"
	};
	
	public static String selectMenu(){
		return LUNCH[new Random().nextInt(10)];
	}
}
