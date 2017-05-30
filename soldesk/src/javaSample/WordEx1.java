package javaSample;

import java.util.Scanner;

class WordEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArr = {"CHANGE", "LOVE", "HOPE", "VIEW"};
		
		String answer = getAnswer(strArr);
		String question = getScrambleWord(answer);
		
		Scanner inputStr = new Scanner(System.in);
		
		while(true){
			System.out.println("Question : "+question);
			System.out.print("������ : ");
			
			String answerStr = inputStr.next();
			
			if(answerStr.equalsIgnoreCase("Q")){
				break;
			}else if(answerStr.equals(answer)){
				System.out.println("�����Դϴ�.");
				break;
			}else{
				System.out.println(answerStr+"�� ������ �ƴմϴ�. �ٽ� �õ��غ�����.");
			}
		}
	}
	
	public static String getAnswer(String[] strArr){
		int idx = (int)(Math.random()*strArr.length);
		
		return strArr[idx];
	}
	
	public static String getScrambleWord(String str){
		char[] chArr = str.toCharArray();
		
		for(int i=0;i<str.length()*2;i++){
			int idx = (int)(Math.random()*str.length());
			
			char tmp = chArr[0];
			chArr[0] = chArr[idx];
			chArr[idx] = tmp;
		}
		
		return new String(chArr);
	}

}





