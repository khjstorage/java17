package ws_java;

public class IfExam6 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int month = 3;
    String str = ""; // 계절별 출력 문자열
   
    System.out.println("월: " + month);
    
    if (3 <= month && month <= 5){
      str = "꽃 여행";
    }else if (6 <= month && month <= 8){
      str = "동해 바다";
    }else if (9 <= month && month <= 11){
      str = "단풍";
    // }else if( month == 12 || month  == 1 || month == 2){
    }else if (month == 12 || (1 <= month && month <= 2)){ 
      str = "눈";
    }
    
    System.out.println(str);
  }

}
