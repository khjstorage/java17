package FormatterClass;

import java.text.ChoiceFormat;

public class ChoiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] point = {61,60,50,80,50,60,70,60,75,65,0};
		String pattern = "0#불합격|60<합격";	// 0을 포함한 0~60는 불합격을, 61~는 합격이라고 표현
		
		ChoiceFormat f1 = new ChoiceFormat(pattern);
		
		for(int i=0;i<point.length;i++)
			System.out.println(i+1+"번:"+f1.format(point[i]));
	}

}
