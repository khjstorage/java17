package ws_java;

public class WhileTest2 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int su = 0;

    while(true){
      su = su + 1;
      
      if (su % 2 == 0 && su % 3 == 0 && 
          su % 4 == 0 && su % 5 == 0 &&
          su % 6 == 0 && su % 7 == 0){
        System.out.println(su);
        break;
      }
    }
  }

}
