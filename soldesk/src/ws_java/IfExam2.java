package ws_java;

public class IfExam2 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int su = 10; // int: 4 byte, ±21억
    System.out.println("정수: " + su);
 
    if (su % 2 == 0){
      System.out.println("2의 배수");
    }else if (su % 3 == 0){
      System.out.println("3의 배수");
    }else if (su % 4 == 0){
      System.out.println("4의 배수");
    }else if (su % 5 == 0){
      System.out.println("5의 배수");
    }else if (su % 6 == 0){
      System.out.println("6의 배수");
    }
  }

}
