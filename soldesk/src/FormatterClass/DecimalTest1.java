package FormatterClass;

import java.text.*;

public class DecimalTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 201402;
		DecimalFormat df = new DecimalFormat("#,###,###");
		DecimalFormat df1 = new DecimalFormat("0,000,000");
		System.out.println("# ��� "+df.format(i));
		System.out.println("0 ��� "+df1.format(i));
	}

}
