package ws_java;

public class ArrayWhile {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    String[] movies = new String[6];
    movies[0] = "레미제라블";
    movies[1] = "그래비티";
    movies[2] = "월터의 상상은 현실이 된다.";
    movies[3] = "인터스텔라";
    movies[4] = "이미테이션 게임";
    movies[5] = "암살";
 
    int index = 0;
    while(true){
      System.out.println(movies[index]);
      index++;
      if (index == 6){
        break;      
      }
    }
    
    System.out.println("--> 배열의 크기: " + movies.length);
  }

}
