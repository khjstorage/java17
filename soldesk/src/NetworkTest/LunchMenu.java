package NetworkTest;

import java.util.Random;

public class LunchMenu {
	private static final String[] LUNCH ={
		"��ġ�", "¥���", "�ø�", "���", "�����", "������", "���κ��", "«��", "������", "�Ұ��"
	};
	
	public static String selectMenu(){
		return LUNCH[new Random().nextInt(10)];
	}
}
