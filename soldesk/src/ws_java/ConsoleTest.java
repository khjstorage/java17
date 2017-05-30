package ws_java;

public class ConsoleTest {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    String name = args[0];
    
    int kor = Integer.parseInt(args[1]);
    int eng = Integer.parseInt(args[2]);
    int mat = Integer.parseInt(args[3]);
    
    int tot = kor + eng + mat;
    int avg = tot / 3;
    
    System.out.println("¼º¸í: " + name);
    System.out.println("ÃÑÁ¡: " + tot);
    System.out.println("Æò±Õ: " + avg);
  }

}
