package ws_java;

public class Logical {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    // boolean: 데이터 타입
    // bol: 변수, 기억 장소, 메모리, 길이 제한 없음.
    // =  : 우측의 값을 좌측의 변수에 저장하는 역활.
    // true: 값(기호, 문자, 숫자)
    boolean bol = true;
    
    System.out.println("문자열 출력: " + "bol"); // +: 문자열 연결
    System.out.println("변수 출력: " + bol);      // 변수의 값이 출력
    System.out.println("2013 > 2014: " + (2013 > 2014));
    
    bol = 2013 > 2014;  // 새로운 값의 할당
    System.out.println("bol: " + bol);    
  }

}
