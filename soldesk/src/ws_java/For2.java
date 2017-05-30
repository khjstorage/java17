package ws_java;

public class For2 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    for (int index=1; index <=100; index++){
      if (index % 2 == 0 && index % 3 == 0 &&
          index % 4 == 0 && index % 5 == 0){
        System.out.println(index);
      }
    }
  }

}
