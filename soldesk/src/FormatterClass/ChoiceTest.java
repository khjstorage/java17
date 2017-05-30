package FormatterClass;

import java.text.ChoiceFormat;

public class ChoiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] point = {61,60,50,80,50,60,70,60,75,65,0};
		String pattern = "0#���հ�|60<�հ�";	// 0�� ������ 0~60�� ���հ���, 61~�� �հ��̶�� ǥ��
		
		ChoiceFormat f1 = new ChoiceFormat(pattern);
		
		for(int i=0;i<point.length;i++)
			System.out.println(i+1+"��:"+f1.format(point[i]));
	}

}
