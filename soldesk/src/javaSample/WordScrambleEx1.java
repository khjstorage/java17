package javaSample;

/*
 * 단어 맞추기 만들기
 */

class WordScrambleEx1 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    String[] strArr = { "CHANGE", "LOVE", "HOPE", "VIEW"}; 

    String answer = getAnswer(strArr); 
    String question = getScrambledWord(answer); 

    System.out.println("Question:"+question); 
    System.out.println("Answer:"+answer); 
  } // main 

  public static String getAnswer(String[] strArr) { 
     // 내용을 완성하세요.
    int idx = (int)(Math.random()*strArr.length); 
    return strArr[idx];
  } 

  public static String getScrambledWord(String str) { 
      // 내용을 완성하세요.
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
