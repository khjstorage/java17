package ws_java;

public class WhileTest1 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int su = 0;
    
    while(true){ // 무한 루틴
       su = su + 1;
       System.out.println(su);
       
       if (su == 5){
         break;  // while문 종료
       }
    }
    
    System.out.println("-----");
    su = 0;      // 재초기화
    
    while(su < 4){ // su 변수가 4보다 작거나 같을 동안 순환
      su = su + 1;
      System.out.println(su);
    }
  }

}
