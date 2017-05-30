package StringPattern;

import java.util.StringTokenizer;

public class StringTokenizerTest2 {
	public StringTokenizerTest2(){
		String msg = "±è±æµ¿, À±¿ë¼ö, ¹Ú±æµ¿, Á¤ÇöÀÚ, ÀÌ±¤±â, °­À±¼ö";
		StringTokenizer stk = new StringTokenizer(msg, ",. À±", true);
		System.out.println("ÅäÅ«ÀÇ °¹¼ö : "+stk.countTokens());
		
		while(stk.hasMoreTokens()){
			System.out.println(stk.nextToken());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new StringTokenizerTest2();
	}

}



