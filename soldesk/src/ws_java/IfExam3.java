package ws_java;

public class IfExam3 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int rank = 1;          // 순위
    String product = ""; // 상품
    
    if (rank == 1){
      product = "노트북";
    }else if(rank == 2){
      product = "무한 복합 프린터";
    }else if(rank == 3){
      product = "2TB HDD";
    }else{
      product = "다음 기회에...";
    }
 
    System.out.println("등수: " + rank + " 상품: " + product);
  }

}
