package javaSample;

import java.util.*; 

class WordScrambleEx2 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    String[] strArr = { "CHANGE", "LOVE", "HOPE", "VIEW"}; 

    String answer = getAnswer(strArr); 
    String question = getScrambledWord(answer); 
    
    Scanner inputStr = new Scanner(System.in); // ���� �Է� 

    while(true) { 
          System.out.println("Question :" + question); 
          System.out.print("Your answer is :"); 
          
          // 1. ȭ���� ���� ������� �Է��� �޴´�.(ScannerŬ���� ���)
          // 2. ����ڰ� q �Ǵ� Q�� �Է��ϸ� ���α׷��� �����Ѵ�.
          // 3. ����ڰ� ������ ���⶧���� �ݺ��ϴٰ�
          //     ����ڰ� ������ ���߸�, while���� ����������.                   
          String answerStr = inputStr.next();
          
          if(answerStr.equals("Q") || answerStr.equals("q")){
            break;
          }else if(answerStr.equals(answer)){
            System.out.println("�����Դϴ�.");
            break;
          }else{
            System.out.println(answerStr + "�� ������ �ƴմϴ�. �ٽ� �õ��غ�����.");
          }
          
    } // while 
  }
  
  public static String getAnswer(String[] strArr) { 
      int idx = (int)(Math.random()*strArr.length); 
      return strArr[idx]; 
  } 

  public static String getScrambledWord(String str) { 
      char[] chArr = str.toCharArray(); 
  
      for(int i=0;i<str.length()*2;i++) {
             int idx = (int)(Math.random()*str.length()); 
            
            char tmp = chArr[0]; 
            chArr[0] = chArr[idx]; 
            chArr[idx] = tmp; 
      } 
  
      return new String(chArr); 
  } // scramble(String str) 
}
