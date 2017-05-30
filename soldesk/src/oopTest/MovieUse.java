package oopTest;

class Movie {
  /**
   * 출력
   * @param name 영화명
   */
  public void print(String name){
    System.out.println("영화명: " + name);
  }
 
  public void print(String name, String type){
    System.out.println("----------------------------");
    System.out.println("영화명: " + name);
    System.out.println("장   르: " + type);
  }
 
  public void print(String name, String type, int time){
    System.out.println("----------------------------");
    System.out.println("영화명: " + name);
    System.out.println("장   르: " + type);
    System.out.println("시   간: " + time);
  }
  
  public void print(String[] actor){
    System.out.println("----------------------------");
    for(int index=0; index < actor.length; index++){ // 0 ~ 4
      System.out.println(actor[index]);
    }
  }
}

public class MovieUse {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Movie movie = new Movie();
    movie.print("앤트맨");
    movie.print("앤트맨", "액션/코믹");
    movie.print("앤트맨", "액션/코믹", 120);
 
    String[] actor = new String[5];
    actor[0] = "전지현";
    actor[1] = "이정재";
    actor[2] = "하정우";
    actor[3] = "오달수";
    actor[4] = "조진웅";
    
    movie.print(actor);
  }

}
