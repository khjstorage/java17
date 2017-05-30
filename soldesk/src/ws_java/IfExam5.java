package ws_java;

public class IfExam5 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int java = 50;
    int jsp = 80;
    int spring = 60;
    String test = ""; //  통과, 재심사
 
    if (java >= 80 || jsp >= 80 || spring >= 80){
      test = "통과";
    }else{
      test = "재심사";
    }
    System.out.println("결과: " + test);
  }

}
