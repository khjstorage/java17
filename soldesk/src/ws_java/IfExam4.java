package ws_java;

public class IfExam4 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int su = -1000; // int: 4 byte, ±21억
    System.out.println("정수: " + su);
    
    if (0 <= su && su <= 9){
      System.out.println("1의 자리");
    }else if (10 <= su && su <= 99){
      System.out.println("10의 자리");
    }else if (100 <= su && su <= 999){
      System.out.println("100의 자리");
    }else if (1000 <= su){
      System.out.println("1000의 자리 이상");
    }else{
      System.out.println("음수는 처리하지 않습니다.");
    }
  }

}
