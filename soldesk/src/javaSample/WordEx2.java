package javaSample;

import java.util.Scanner;

class WordEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArr = {"CHANGE", "LOVE", "HOPE", "VIEW"};
		Scanner s = new Scanner(System.in);
		
		while(true){
			String answer = getAnswer(strArr);
			String question = getScrambleWord(answer);
			char[] hint = new char[answer.length()];
			
			for(int i=0;i<hint.length;i++)
				hint[i] ='_';
			
			while(true){
				System.out.println("Question : "+question);
				System.out.print("정답은 : ");
				
				String input = s.nextLine();
				
				if(input.equalsIgnoreCase("q"))
					System.exit(0);
				
				if(input.equalsIgnoreCase(answer)){
					System.out.println("정답입니다.");
					System.out.println();
				}else{
					System.out.println(input+"는 정답이 아닙니다. 다시 시도해주세요.");
					System.out.println("힌트:"+getHint(answer, hint));
				}
			}
		}//While end
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
	
	public static String getHint(String answer, char[] hint){
		int count = 0;
		
		for(int i=0;i<hint.length;i++){
			if(hint[i] == '_')
				count++;
		}
		
		if(count>2){
			while(true){
				int idx = (int)(Math.random()*answer.length());
				
				if(hint[idx]=='_'){
					hint[idx] = answer.charAt(idx);
					break;
				}
			}
		}
		
		return new String(hint);
	}

}






